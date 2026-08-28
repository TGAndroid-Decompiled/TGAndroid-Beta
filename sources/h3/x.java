package h3;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.xb0;
public final class x implements d5.k, jk0, xb0, org.telegram.ui.ActionBar.b2 {
    public final int f9805a;
    public final int f9806b;

    public x(int i9, int i10) {
        this.f9805a = i10;
        this.f9806b = i9;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        MessagesController.getInstance(this.f9806b).performLogout(1);
    }

    @Override
    public String g(int i9) {
        int i10 = this.f9805a;
        int i11 = this.f9806b;
        switch (i10) {
            case 3:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i9);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i11) {
                    return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
                }
                return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
            default:
                if (i9 == i11) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i9));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f9805a) {
            case 0:
                ((a2) obj).onRepeatModeChanged(this.f9806b);
                return;
            default:
                i3.b bVar = (i3.b) obj;
                bVar.getClass();
                bVar.e(this.f9806b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f9806b;
    }

    public x(i3.a aVar, int i9, b2 b2Var, b2 b2Var2) {
        this.f9805a = 1;
        this.f9806b = i9;
    }
}
