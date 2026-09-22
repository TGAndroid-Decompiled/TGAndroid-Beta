package org.scilab.forge.jlatexmath;

import a4.a;
import java.util.HashMap;
import w.c;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String g10 = c.g(str, "@env");
        StringBuilder h = c.h(str2, " #");
        int i11 = i10 + 1;
        h.append(i11);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addNewCommand(g10, h.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String g10 = c.g(str, "@env");
            StringBuilder h = c.h(str2, " #");
            int i11 = i10 + 1;
            h.append(i11);
            h.append(" ");
            h.append(str3);
            NewCommandMacro.addReNewCommand(g10, h.toString(), i11);
            return;
        }
        throw new ParseException(a.q("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
