package i4;

import b2.s0;
import e2.d0;
import e2.v;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
public abstract class i {
    public static final Pattern f11853a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(v vVar) {
        vVar.getClass();
        String k10 = vVar.k(StandardCharsets.UTF_8);
        if (k10 != null && k10.startsWith("WEBVTT")) {
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
        String str2 = d0.f8737a;
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

    public static void d(v vVar) {
        int i10 = vVar.f8790b;
        if (a(vVar)) {
            return;
        }
        vVar.J(i10);
        throw s0.a(null, "Expected WEBVTT. Got " + vVar.k(StandardCharsets.UTF_8));
    }
}
