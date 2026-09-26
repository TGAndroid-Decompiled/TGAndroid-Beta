package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.il0;
public final class w implements e2.m, d9.e, e2.h, il0, bd0, z1 {
    public final int f10891a;
    public final int f10892b;

    public w(int i10, int i11) {
        this.f10891a = i11;
        this.f10892b = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f10891a) {
            case 3:
                ((m4.e1) obj).f0(this.f10892b);
                return;
            case 4:
                ((m4.e1) obj).N(this.f10892b);
                return;
            case 5:
                ((m4.e1) obj).j(this.f10892b);
                return;
            default:
                ((m4.e1) obj).D0(this.f10892b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f10892b);
    }

    @Override
    public void f(a2 a2Var, int i10) {
        MessagesController.getInstance(this.f10892b).performLogout(1);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10891a) {
            case 0:
                ((b2.z0) obj).onRepeatModeChanged(this.f10892b);
                return;
            default:
                ((b2.z0) obj).onAudioSessionIdChanged(this.f10892b);
                return;
        }
    }

    @Override
    public String j(int i10) {
        int i11 = this.f10891a;
        int i12 = this.f10892b;
        switch (i11) {
            case 8:
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
        return this.f10892b;
    }
}
