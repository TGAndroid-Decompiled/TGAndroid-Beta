package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.zc0;
public final class v implements e2.m, d9.e, gl0, zc0, c2 {
    public final int f10390a;
    public final int f10391b;

    public v(int i10, int i11) {
        this.f10390a = i11;
        this.f10391b = i10;
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f10391b);
    }

    @Override
    public void f(d2 d2Var, int i10) {
        MessagesController.getInstance(this.f10391b).performLogout(1);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10390a) {
            case 0:
                ((b2.z0) obj).onRepeatModeChanged(this.f10391b);
                return;
            default:
                ((b2.z0) obj).onAudioSessionIdChanged(this.f10391b);
                return;
        }
    }

    @Override
    public String k(int i10) {
        int i11 = this.f10390a;
        int i12 = this.f10391b;
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
    public int run() {
        return this.f10391b;
    }
}
