package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.jl0;
public final class w implements e2.m, d9.e, e2.h, jl0, cd0, a2 {
    public final int f11866a;
    public final int f11867b;

    public w(int i10, int i11) {
        this.f11866a = i11;
        this.f11867b = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11866a) {
            case 3:
                ((m4.e1) obj).f0(this.f11867b);
                return;
            case 4:
                ((m4.e1) obj).N(this.f11867b);
                return;
            case 5:
                ((m4.e1) obj).j(this.f11867b);
                return;
            default:
                ((m4.e1) obj).D0(this.f11867b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f11867b);
    }

    @Override
    public String e(int i10) {
        int i11 = this.f11866a;
        int i12 = this.f11867b;
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
    public void g(b2 b2Var, int i10) {
        MessagesController.getInstance(this.f11867b).performLogout(1);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11866a) {
            case 0:
                ((b2.z0) obj).onRepeatModeChanged(this.f11867b);
                return;
            default:
                ((b2.z0) obj).onAudioSessionIdChanged(this.f11867b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f11867b;
    }
}
