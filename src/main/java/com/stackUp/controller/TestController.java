package com.stackUp.controller;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class TestController {

    @RequestMapping(value = {"/"})
    public String test(ModelMap model) {

        return "/test";
    }


    @ResponseBody
    @RequestMapping(value = {"/test"})
    public String taKeywordView(@RequestParam Map<String, Object> paramMap, HttpServletResponse response, HttpServletRequest request, ModelMap model) {

        return "최유진&차동현";
    }
}
