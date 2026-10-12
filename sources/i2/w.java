package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.ud0;
public final class w implements e2.m, d9.e, e2.h, hm0, ud0 {
    public final int f11914a;
    public final int f11915b;

    public w(int i10, int i11) {
        this.f11914a = i11;
        this.f11915b = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f11914a) {
            case 3:
                ((m4.g1) obj).f0(this.f11915b);
                return;
            case 4:
                ((m4.g1) obj).N(this.f11915b);
                return;
            case 5:
                ((m4.g1) obj).j(this.f11915b);
                return;
            default:
                ((m4.g1) obj).D0(this.f11915b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f11915b);
    }

    @Override
    public String e(int i10) {
        int i11 = this.f11914a;
        int i12 = this.f11915b;
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
        switch (this.f11914a) {
            case 0:
                ((b2.z0) obj).onRepeatModeChanged(this.f11915b);
                return;
            default:
                ((b2.z0) obj).onAudioSessionIdChanged(this.f11915b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f11915b;
    }
}
