package cg;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bc0;

public final class d implements bc0 {

    public final int f2626a;

    public final long f2627b;

    public final Calendar f2628c;
    public final int d;

    public d(long j10, Calendar calendar, int i10, int i11) {
        this.f2626a = i11;
        this.f2627b = j10;
        this.f2628c = calendar;
        this.d = i10;
    }

    @Override
    public final String g(int i10) {
        switch (this.f2626a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (((long) i10) * 86400000) + this.f2627b;
                Calendar calendar = this.f2628c;
                calendar.setTimeInMillis(j10);
                return calendar.get(1) == this.d ? LocaleController.getInstance().getFormatterScheduleDay().format(j10) : LocaleController.getInstance().getFormatterScheduleYear().format(j10);
            default:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j11 = (((long) i10) * 86400000) + this.f2627b;
                Calendar calendar2 = this.f2628c;
                calendar2.setTimeInMillis(j11);
                if (calendar2.get(1) != this.d) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(j11);
                }
                return LocaleController.getInstance().getFormatterWeek().format(j11) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j11);
        }
    }
}
