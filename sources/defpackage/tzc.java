package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
public abstract class tzc {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(ey7 ey7Var) {
        String n = ey7Var.n(StandardCharsets.UTF_8);
        if (n != null && n.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = gcc.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() == 3) {
                j2 += Long.parseLong(trim);
            } else {
                lq5.j("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
        }
        return j2 * 1000;
    }

    public static void d(ey7 ey7Var) {
        int i = ey7Var.b;
        if (a(ey7Var)) {
            return;
        }
        ey7Var.N(i);
        throw hy7.a("Expected WEBVTT. Got " + ey7Var.n(StandardCharsets.UTF_8), null);
    }
}
