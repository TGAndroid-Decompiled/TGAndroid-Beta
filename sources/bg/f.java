package bg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.xb0;
public final class f implements xb0 {
    public final int f1748a;
    public final long f1749b;
    public final Calendar f1750c;
    public final int d;

    public f(long j10, Calendar calendar, int i9, int i10) {
        this.f1748a = i10;
        this.f1749b = j10;
        this.f1750c = calendar;
        this.d = i9;
    }

    @Override
    public final String g(int i9) {
        switch (this.f1748a) {
            case 0:
                if (i9 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i9 * 86400000) + this.f1749b;
                Calendar calendar = this.f1750c;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j11 = (i9 * 86400000) + this.f1749b;
                Calendar calendar2 = this.f1750c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j11) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j11);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
        }
    }
}
