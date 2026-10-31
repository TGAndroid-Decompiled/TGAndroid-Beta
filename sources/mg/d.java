package mg;

import java.util.Calendar;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.wb0;
public final class d implements wb0 {
    public final int f13087a;
    public final long f13088b;
    public final Calendar f13089c;
    public final int d;

    public d(long j10, Calendar calendar, int i10, int i11) {
        this.f13087a = i11;
        this.f13088b = j10;
        this.f13089c = calendar;
        this.d = i10;
    }

    @Override
    public final String e(int i10) {
        int i11 = this.f13087a;
        int i12 = this.d;
        Calendar calendar = this.f13089c;
        long j10 = this.f13088b;
        switch (i11) {
            case 0:
                if (i10 == 0) {
                    return cd.L0(2131748546, "MessageScheduleToday");
                }
                long j11 = (i10 * 86400000) + j10;
                calendar.setTimeInMillis(j11);
                if (calendar.get(1) == i12) {
                    return cd.D0().v0().format(j11);
                }
                return cd.D0().x0().format(j11);
            default:
                if (i10 == 0) {
                    return cd.L0(2131748546, null);
                }
                long j12 = (i10 * 86400000) + j10;
                calendar.setTimeInMillis(j12);
                if (calendar.get(1) == i12) {
                    return cd.D0().z0().format(j12) + " " + cd.D0().v0().format(j12);
                }
                return cd.D0().x0().format(j12);
        }
    }
}
