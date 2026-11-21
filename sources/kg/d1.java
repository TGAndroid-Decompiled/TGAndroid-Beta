package kg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.gd;
public final class d1 {
    public int f18314a;
    public int f18315b;

    public d1(int i7, int i10) {
        this.f18314a = i7;
        this.f18315b = i10;
    }

    public static String a(int i7) {
        String str;
        String str2;
        int i10 = i7 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i7 - i10) / 60) % 24, i10);
        gd E0 = gd.E0();
        if (E0.f24250c == null) {
            synchronized (E0) {
                try {
                    if (E0.f24250c == null) {
                        Locale locale = E0.f24269y;
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
                        boolean z10 = gd.f24243c0;
                        if (z10) {
                            str = "HH:mm";
                        } else {
                            str = "h:mm a";
                        }
                        if (z10) {
                            str2 = "HH:mm";
                        } else {
                            str2 = "h:mm a";
                        }
                        E0.f24250c = gd.k(locale, str, str2);
                    }
                } finally {
                }
            }
        }
        String format = E0.f24250c.format(calendar.getTime());
        if (i7 > 1440) {
            return gd.a0(null, null, 2131752736, format);
        }
        return format;
    }

    public final String toString() {
        return a(this.f18314a) + " - " + a(this.f18315b);
    }
}
