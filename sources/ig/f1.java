package ig;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class f1 {
    public int f12067a;
    public int f12068b;

    public f1(int i10, int i11) {
        this.f12067a = i10;
        this.f12068b = i11;
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
        return a(this.f12067a) + " - " + a(this.f12068b);
    }
}
