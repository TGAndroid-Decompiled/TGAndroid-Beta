package a5;

import d5.g0;
import d5.z;
import h3.t1;
import java.util.regex.Pattern;

public abstract class m {

    public static final Pattern f97a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(z zVar) {
        zVar.getClass();
        String strF = zVar.f(o8.d.f19363c);
        return strF != null && strF.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i10 = g0.f4795a;
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        long j11 = j10 * 1000;
        if (strArrSplit.length == 2) {
            j11 += Long.parseLong(strArrSplit[1]);
        }
        return j11 * 1000;
    }

    public static void d(z zVar) throws t1 {
        int i10 = zVar.f4859b;
        if (a(zVar)) {
            return;
        }
        zVar.C(i10);
        throw t1.a("Expected WEBVTT. Got " + zVar.f(o8.d.f19363c), null);
    }
}
