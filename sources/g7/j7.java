package g7;

import java.util.Locale;

public abstract class j7 {
    public static int a(int i10) {
        if (i10 >= 100 || i10 < 0) {
            return i10;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.recaptcha.internal.a.n(String.valueOf(e7.v.s2().get(1)), 2, 0), Integer.valueOf(i10)));
    }
}
