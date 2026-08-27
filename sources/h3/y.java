package h3;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.mk0;

public final class y implements d5.k, mk0, bc0, org.telegram.ui.ActionBar.a2 {

    public final int f8245a;

    public final int f8246b;

    public y(int i10, int i11) {
        this.f8245a = i11;
        this.f8246b = i10;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        MessagesController.getInstance(this.f8246b).performLogout(1);
    }

    @Override
    public String g(int i10) {
        int i11 = this.f8245a;
        int i12 = this.f8246b;
        switch (i11) {
            case 3:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                LocalDate localDatePlusDays = LocalDate.now().plusDays(i10);
                int year = localDatePlusDays.getYear();
                long epochMilli = localDatePlusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year != i12) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(epochMilli);
                }
                return LocaleController.getInstance().getFormatterWeek().format(epochMilli) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(epochMilli);
            default:
                return i10 == i12 ? "—" : String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8245a) {
            case 0:
                ((a2) obj).onRepeatModeChanged(this.f8246b);
                break;
            default:
                i3.b bVar = (i3.b) obj;
                bVar.getClass();
                bVar.e(this.f8246b);
                break;
        }
    }

    @Override
    public int run() {
        return this.f8246b;
    }

    public y(i3.a aVar, int i10, b2 b2Var, b2 b2Var2) {
        this.f8245a = 1;
        this.f8246b = i10;
    }
}
