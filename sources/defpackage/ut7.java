package defpackage;

import java.util.Calendar;
import java.util.Locale;
public final class ut7 {
    public int a;
    public int b;

    public ut7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static String a(int i) {
        String str;
        String str2;
        int i2 = i % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i - i2) / 60) % 24, i2);
        ob6 D0 = ob6.D0();
        if (D0.c == null) {
            synchronized (D0) {
                if (D0.c == null) {
                    Locale locale = D0.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    String language = locale.getLanguage();
                    if (language == null) {
                        language = "en";
                    }
                    String lowerCase = language.toLowerCase();
                    if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                        locale = Locale.US;
                    }
                    boolean z = ob6.c0;
                    if (z) {
                        str = "HH:mm";
                    } else {
                        str = "h:mm a";
                    }
                    if (z) {
                        str2 = "HH:mm";
                    } else {
                        str2 = "h:mm a";
                    }
                    D0.c = ob6.k(str, str2, locale);
                }
            }
        }
        String format = D0.c.format(calendar.getTime());
        if (i > 1440) {
            return ob6.a0(null, null, 2131752729, format);
        }
        return format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
