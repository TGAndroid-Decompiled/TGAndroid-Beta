package gg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.tc0;
public final class c implements tc0 {
    public final int f6573a;
    public final long f6574b;
    public final Calendar f6575c;
    public final int d;

    public c(long j10, Calendar calendar, int i10, int i11) {
        this.f6573a = i11;
        this.f6574b = j10;
        this.f6575c = calendar;
        this.d = i10;
    }

    @Override
    public final String e(int i10) {
        switch (this.f6573a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f6574b;
                Calendar calendar = this.f6575c;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j11 = (i10 * 86400000) + this.f6574b;
                Calendar calendar2 = this.f6575c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j11) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j11);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
        }
    }
}
