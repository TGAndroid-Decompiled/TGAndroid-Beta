package h7;

import java.util.Locale;
public abstract class w7 {
    public static int a(int i10) {
        if (i10 < 100 && i10 >= 0) {
            return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.recaptcha.internal.a.m(String.valueOf(ab.b.A3().get(1)), 2, 0), Integer.valueOf(i10)));
        }
        return i10;
    }
}
