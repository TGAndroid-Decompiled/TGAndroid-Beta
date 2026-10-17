package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.tl0;
public final class u implements e2.o, d9.k, e2.j, tl0, kd0 {
    public final int f12597a;
    public final int f12598b;

    public u(int i10, int i11) {
        this.f12597a = i11;
        this.f12598b = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f12597a) {
            case 3:
                ((m4.m1) obj).g0(this.f12598b);
                return;
            case 4:
                ((m4.m1) obj).M(this.f12598b);
                return;
            case 5:
                ((m4.m1) obj).j(this.f12598b);
                return;
            default:
                ((m4.m1) obj).G0(this.f12598b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f12598b);
    }

    @Override
    public String e(int i10) {
        int i11 = this.f12597a;
        int i12 = this.f12598b;
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
    public void invoke(Object obj) {
        switch (this.f12597a) {
            case 0:
                ((b2.d1) obj).onRepeatModeChanged(this.f12598b);
                return;
            default:
                ((b2.d1) obj).onAudioSessionIdChanged(this.f12598b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f12598b;
    }
}
