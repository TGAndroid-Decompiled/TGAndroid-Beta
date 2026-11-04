package lg;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.bd;
public final class c1 {
    public int f18261a;
    public int f18262b;

    public c1(int i3, int i10) {
        this.f18261a = i3;
        this.f18262b = i10;
    }

    public static String a(int i3) {
        String str;
        String str2;
        int i10 = i3 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i3 - i10) / 60) % 24, i10);
        bd E0 = bd.E0();
        if (E0.f21793c == null) {
            synchronized (E0) {
                try {
                    if (E0.f21793c == null) {
                        Locale locale = E0.f21812y;
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
                        boolean z10 = bd.f21786c0;
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
                        E0.f21793c = bd.k(locale, str, str2);
                    }
                } finally {
                }
            }
        }
        String format = E0.f21793c.format(calendar.getTime());
        if (i3 > 1440) {
            return bd.a0(null, null, 2131752748, format);
        }
        return format;
    }

    public final String toString() {
        return a(this.f18261a) + " - " + a(this.f18262b);
    }
}
