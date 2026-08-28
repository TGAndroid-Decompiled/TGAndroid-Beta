package a5;

import d5.f0;
import d5.y;
import h3.t1;
import java.util.regex.Pattern;
public abstract class l {
    public static final Pattern f95a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(y yVar) {
        yVar.getClass();
        String f10 = yVar.f(n8.d.f18513c);
        if (f10 != null && f10.startsWith("WEBVTT")) {
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
        int i9 = f0.f4349a;
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

    public static void d(y yVar) {
        int i9 = yVar.f4411b;
        if (a(yVar)) {
            return;
        }
        yVar.C(i9);
        throw t1.a("Expected WEBVTT. Got " + yVar.f(n8.d.f18513c), null);
    }
}
