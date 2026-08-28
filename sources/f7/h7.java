package f7;

import java.util.Locale;
public abstract class h7 {
    public static int a(int i9) {
        if (i9 < 100 && i9 >= 0) {
            return Integer.parseInt(String.format(Locale.US, "%s%02d", e2.c.m(String.valueOf(za.a.p3().get(1)), 2, 0), Integer.valueOf(i9)));
        }
        return i9;
    }
}
