package org.scilab.forge.jlatexmath;

import java.util.HashMap;

public class NewCommandMacro {
    protected static HashMap<String, String> macrocode = new HashMap<>();
    protected static HashMap<String, String> macroreplacement = new HashMap<>();

    public static void addNewCommand(String str, String str2, int i) {
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i));
    }

    public static void addNewCommand(String str, String str2, int i, String str3) {
        if (macrocode.get(str) != null) {
            throw new ParseException("Command " + str + " already exists ! Use renewcommand instead ...");
        }
        macrocode.put(str, str2);
        macroreplacement.put(str, str3);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i, 1.0f));
    }

    public static boolean isMacro(String str) {
        return macrocode.containsKey(str);
    }

    public static void reset() {
        macrocode.clear();
        macroreplacement.clear();
    }

    public static void addReNewCommand(String str, String str2, int i) {
        if (macrocode.get(str) == null) {
            throw new ParseException("Command " + str + " is not defined ! Use newcommand instead ...");
        }
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i));
    }

    public java.lang.String executeMacro(org.scilab.forge.jlatexmath.TeXParser r7, java.lang.String[] r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.scilab.forge.jlatexmath.NewCommandMacro.executeMacro(org.scilab.forge.jlatexmath.TeXParser, java.lang.String[]):java.lang.String");
    }
}
