package j3;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.wk0;
public final class x implements f5.j, wk0, mc0, org.telegram.ui.ActionBar.b2 {
    public final int f10842a;
    public final int f10843b;

    public x(int i10, int i11) {
        this.f10842a = i11;
        this.f10843b = i10;
    }

    @Override
    public String e(int i10) {
        int i11 = this.f10842a;
        int i12 = this.f10843b;
        switch (i11) {
            case 3:
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
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        MessagesController.getInstance(this.f10843b).performLogout(1);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f10842a) {
            case 0:
                ((a2) obj).onRepeatModeChanged(this.f10843b);
                return;
            default:
                k3.b bVar = (k3.b) obj;
                bVar.getClass();
                bVar.e(this.f10843b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f10843b;
    }

    public x(k3.a aVar, int i10, b2 b2Var, b2 b2Var2) {
        this.f10842a = 1;
        this.f10843b = i10;
    }
}
