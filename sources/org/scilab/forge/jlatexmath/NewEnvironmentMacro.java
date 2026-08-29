package org.scilab.forge.jlatexmath;

import a4.w;
import java.util.HashMap;
import u3.c;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String k9 = c.k(str, "@env");
        StringBuilder f9 = c.f(str2, " #");
        int i11 = i10 + 1;
        f9.append(i11);
        f9.append(" ");
        f9.append(str3);
        NewCommandMacro.addNewCommand(k9, f9.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String k9 = c.k(str, "@env");
            StringBuilder f9 = c.f(str2, " #");
            int i11 = i10 + 1;
            f9.append(i11);
            f9.append(" ");
            f9.append(str3);
            NewCommandMacro.addReNewCommand(k9, f9.toString(), i11);
            return;
        }
        throw new ParseException(w.n("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
