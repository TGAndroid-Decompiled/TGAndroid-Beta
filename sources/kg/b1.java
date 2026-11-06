package kg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.hd;
public final class b1 {
    public int f17313a;
    public int f17314b;

    public b1(int i7, int i10) {
        this.f17313a = i7;
        this.f17314b = i10;
    }

    public static String a(int i7) {
        String str;
        String str2;
        int i10 = i7 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i7 - i10) / 60) % 24, i10);
        hd E0 = hd.E0();
        if (E0.f22887c == null) {
            synchronized (E0) {
                try {
                    if (E0.f22887c == null) {
                        Locale locale = E0.f22906y;
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
                        boolean z9 = hd.f22880c0;
                        if (z9) {
                            str = "HH:mm";
                        } else {
                            str = "h:mm a";
                        }
                        if (z9) {
                            str2 = "HH:mm";
                        } else {
                            str2 = "h:mm a";
                        }
                        E0.f22887c = hd.k(locale, str, str2);
                    }
                } finally {
                }
            }
        }
        String format = E0.f22887c.format(calendar.getTime());
        if (i7 > 1440) {
            return hd.a0(null, null, 2131752748, format);
        }
        return format;
    }

    public final String toString() {
        return a(this.f17313a) + " - " + a(this.f17314b);
    }
}
