package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.wk0;
public final class w implements e2.m, d9.e, wk0, rc0, a2 {
    public final int f11773a;
    public final int f11774b;

    public w(int i10, int i11) {
        this.f11773a = i11;
        this.f11774b = i10;
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f11774b);
    }

    @Override
    public String f(int i10) {
        int i11 = this.f11773a;
        int i12 = this.f11774b;
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
    public void g(b2 b2Var, int i10) {
        MessagesController.getInstance(this.f11774b).performLogout(1);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11773a) {
            case 0:
                ((b2.z0) obj).onRepeatModeChanged(this.f11774b);
                return;
            default:
                ((b2.z0) obj).onAudioSessionIdChanged(this.f11774b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f11774b;
    }
}
