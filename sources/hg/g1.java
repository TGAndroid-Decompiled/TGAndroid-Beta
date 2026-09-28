package hg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class g1 {
    public int f10277a;
    public int f10278b;

    public g1(int i10, int i11) {
        this.f10277a = i10;
        this.f10278b = i11;
    }

    public static String a(int i10) {
        int i11 = i10 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i10 - i11) / 60) % 24, i11);
        String format = LocaleController.getInstance().getFormatterConstDay().format(calendar.getTime());
        if (i10 > 1440) {
            return LocaleController.formatString(R.string.BusinessHoursNextDay, format);
        }
        return format;
    }

    public final String toString() {
        return a(this.f10277a) + " - " + a(this.f10278b);
    }
}
