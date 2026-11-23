package kg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.hd;
public final class e1 {
    public int f18300a;
    public int f18301b;

    public e1(int i7, int i10) {
        this.f18300a = i7;
        this.f18301b = i10;
    }

    public static String a(int i7) {
        String str;
        String str2;
        int i10 = i7 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i7 - i10) / 60) % 24, i10);
        hd E0 = hd.E0();
        if (E0.f24417c == null) {
            synchronized (E0) {
                try {
                    if (E0.f24417c == null) {
                        Locale locale = E0.f24436y;
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
                        boolean z10 = hd.f24410c0;
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
                        E0.f24417c = hd.k(locale, str, str2);
                    }
                } finally {
                }
            }
        }
        String format = E0.f24417c.format(calendar.getTime());
        if (i7 > 1440) {
            return hd.a0(null, null, 2131752736, format);
        }
        return format;
    }

    public final String toString() {
        return a(this.f18300a) + " - " + a(this.f18301b);
    }
}
