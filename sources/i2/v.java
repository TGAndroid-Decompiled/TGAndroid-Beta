package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.wk0;
public final class v implements e2.m, d9.e, wk0, qc0, a2 {
    public final int f10895a;
    public final int f10896b;

    public v(int i10, int i11) {
        this.f10895a = i11;
        this.f10896b = i10;
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f10896b);
    }

    @Override
    public String e(int i10) {
        int i11 = this.f10895a;
        int i12 = this.f10896b;
        switch (i11) {
            case 4:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i10);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i12) {
                    return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
            default:
                if (i10 == i12) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        MessagesController.getInstance(this.f10896b).performLogout(1);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10895a) {
            case 0:
                ((b2.z0) obj).onRepeatModeChanged(this.f10896b);
                return;
            default:
                ((b2.z0) obj).onAudioSessionIdChanged(this.f10896b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f10896b;
    }
}
