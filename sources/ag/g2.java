package ag;

import java.util.Calendar;
import java.util.Locale;
import org.telegram.messenger.dd;
public final class g2 {
    public int f532a;
    public int f533b;

    public g2(int i10, int i11) {
        this.f532a = i10;
        this.f533b = i11;
    }

    public static String a(int i10) {
        String str;
        String str2;
        int i11 = i10 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i10 - i11) / 60) % 24, i11);
        dd D0 = dd.D0();
        if (D0.f15347c == null) {
            synchronized (D0) {
                try {
                    if (D0.f15347c == null) {
                        Locale locale = D0.f15365y;
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
                        boolean z10 = dd.Z;
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
                        D0.f15347c = dd.k(locale, str, str2);
                    }
                } finally {
                }
            }
        }
        String format = D0.f15347c.format(calendar.getTime());
        if (i10 > 1440) {
            return dd.a0(null, null, 2131752748, format);
        }
        return format;
    }

    public final String toString() {
        return a(this.f532a) + " - " + a(this.f533b);
    }
}
