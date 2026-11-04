package org.scilab.forge.jlatexmath;

import a1.g;
import java.util.HashMap;
import t4.c;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i3) {
        String q10 = c.q(str, "@env");
        StringBuilder h = c.h(str2, " #");
        int i10 = i3 + 1;
        h.append(i10);
        h.append(" ");
        h.append(str3);
        NewCommandMacro.addNewCommand(q10, h.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i3) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String q10 = c.q(str, "@env");
            StringBuilder h = c.h(str2, " #");
            int i10 = i3 + 1;
            h.append(i10);
            h.append(" ");
            h.append(str3);
            NewCommandMacro.addReNewCommand(q10, h.toString(), i10);
            return;
        }
        throw new ParseException(g.q("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
