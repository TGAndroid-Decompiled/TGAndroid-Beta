package l4;

import e2.t0;
import h2.m0;
import h2.x;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
public abstract class i {
    public static final Pattern f18169a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(x xVar) {
        xVar.getClass();
        String n10 = xVar.n(StandardCharsets.UTF_8);
        if (n10 != null && n10.startsWith("WEBVTT")) {
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
        String str2 = m0.f14112a;
        String[] split = str.split("\\.", 2);
        long j3 = 0;
        for (String str3 : split[0].split(":", -1)) {
            j3 = (j3 * 60) + Long.parseLong(str3);
        }
        long j10 = j3 * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() == 3) {
                j10 += Long.parseLong(trim);
            } else {
                throw new IllegalArgumentException("Expected 3 decimal places, got: ".concat(trim));
            }
        }
        return j10 * 1000;
    }

    public static void d(x xVar) {
        int i7 = xVar.f14163b;
        if (a(xVar)) {
            return;
        }
        xVar.N(i7);
        throw t0.a(null, "Expected WEBVTT. Got " + xVar.n(StandardCharsets.UTF_8));
    }
}
