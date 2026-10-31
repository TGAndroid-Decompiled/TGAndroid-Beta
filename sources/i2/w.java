package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.wb0;
public final class w implements e2.o, d9.k, e2.j, dk0, wb0 {
    public final int f8105a;
    public final int f8106b;

    public w(int i10, int i11) {
        this.f8105a = i11;
        this.f8106b = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8105a) {
            case 3:
                ((m4.n1) obj).f0(this.f8106b);
                return;
            case 4:
                ((m4.n1) obj).M(this.f8106b);
                return;
            case 5:
                ((m4.n1) obj).k(this.f8106b);
                return;
            default:
                ((m4.n1) obj).G0(this.f8106b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f8106b);
    }

    @Override
    public String e(int i10) {
        int i11 = this.f8105a;
        int i12 = this.f8106b;
        switch (i11) {
            case 8:
                if (i10 == 0) {
                    return cd.L0(2131748546, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i10);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i12) {
                    return cd.D0().z0().format(epochMilli) + ", " + cd.D0().v0().format(epochMilli);
                }
                return cd.D0().x0().format(epochMilli);
            default:
                if (i10 == i12) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8105a) {
            case 0:
                ((b2.d1) obj).c(this.f8106b);
                return;
            default:
                ((b2.d1) obj).a(this.f8106b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f8106b;
    }
}
