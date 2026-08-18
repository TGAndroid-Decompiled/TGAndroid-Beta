package org.scilab.forge.jlatexmath;

import java.util.HashMap;
import java.util.regex.Matcher;

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

    public String executeMacro(TeXParser teXParser, String[] strArr) {
        int i = 0;
        String strReplaceAll = macrocode.get(strArr[0]);
        int length = strArr.length;
        int i2 = length - 11;
        String str = strArr[length - 10];
        if (str != null) {
            strReplaceAll = strReplaceAll.replaceAll("#1", Matcher.quoteReplacement(str));
        } else {
            if (macroreplacement.get(strArr[0]) != null) {
                strReplaceAll = strReplaceAll.replaceAll("#1", Matcher.quoteReplacement(macroreplacement.get(strArr[0])));
            }
            for (int i3 = 1; i3 <= i2; i3++) {
                strReplaceAll = strReplaceAll.replaceAll("#" + (i3 + i), Matcher.quoteReplacement(strArr[i3]));
            }
            return strReplaceAll;
        }
        i = 1;
        while (i3 <= i2) {
            strReplaceAll = strReplaceAll.replaceAll("#" + (i3 + i), Matcher.quoteReplacement(strArr[i3]));
        }
        return strReplaceAll;
    }
}
