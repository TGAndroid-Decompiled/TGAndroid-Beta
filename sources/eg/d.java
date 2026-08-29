package eg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mc0;
public final class d implements mc0 {
    public final int f5957a;
    public final long f5958b;
    public final Calendar f5959c;
    public final int d;

    public d(long j10, Calendar calendar, int i10, int i11) {
        this.f5957a = i11;
        this.f5958b = j10;
        this.f5959c = calendar;
        this.d = i10;
    }

    @Override
    public final String e(int i10) {
        switch (this.f5957a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.f5958b;
                Calendar calendar = this.f5959c;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterScheduleDay().format(j10);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j11 = (i10 * 86400000) + this.f5958b;
                Calendar calendar2 = this.f5959c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) == this.d) {
                    return LocaleController.getInstance().getFormatterWeek().format(j11) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j11);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
        }
    }
}
