package com.generation.helloworld_atv.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello-World")
public class BSM_Generation {
	@GetMapping
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("/BSMsGeneration")
	public List<String> BSMsGeneration() {
		return Arrays.asList("\n Mentalidade de Crescimento", "\n Orientação ao Futuro", "\n Persistência",
				"\n Atenção aos detalhes", "\n Trabalho em equipe", "\n Comunicação");

	}

	@GetMapping("/Objetivos-da-Semana")
	public List<String> objetivosDaSemana() {
		return Arrays.asList("Revisar conteúdos Java", "Aprofundar o meu conhecimento no conteúdo de Spring Framework",
				"Treinar meu Pitch", "Arrumar meu LinkedIn");
	}
}
