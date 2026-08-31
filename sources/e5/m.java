package e5;

import h5.d0;
import h5.w;
import j3.r1;
import java.util.regex.Pattern;
public abstract class m {
    public static final Pattern f4990a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(w wVar) {
        wVar.getClass();
        String h = wVar.h(r8.d.f46738c);
        if (h != null && h.startsWith("WEBVTT")) {
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
        int i10 = d0.f7237a;
        String[] split = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : split[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (split.length == 2) {
            j11 += Long.parseLong(split[1]);
        }
        return j11 * 1000;
    }

    public static void d(w wVar) {
        int i10 = wVar.f7309b;
        if (a(wVar)) {
            return;
        }
        wVar.F(i10);
        throw r1.a("Expected WEBVTT. Got " + wVar.h(r8.d.f46738c), null);
    }
}
