package hg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.uc0;
public final class c implements uc0 {
    public final int f7425a;
    public final long f7426b;
    public final Calendar f7427c;
    public final int d;

    public c(long j10, Calendar calendar, int i10, int i11) {
        this.f7425a = i11;
        this.f7426b = j10;
        this.f7427c = calendar;
        this.d = i10;
    }

    @Override
    public final String e(int i10) {
        switch (this.f7425a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f7426b;
                Calendar calendar = this.f7427c;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j11 = (i10 * 86400000) + this.f7426b;
                Calendar calendar2 = this.f7427c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j11) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j11);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
        }
    }
}
