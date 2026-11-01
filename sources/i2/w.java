package i2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.wb0;
public final class w implements e2.o, d9.k, e2.j, ek0, wb0 {
    public final int f8106a;
    public final int f8107b;

    public w(int i10, int i11) {
        this.f8106a = i11;
        this.f8107b = i10;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f8106a) {
            case 3:
                ((m4.n1) obj).f0(this.f8107b);
                return;
            case 4:
                ((m4.n1) obj).M(this.f8107b);
                return;
            case 5:
                ((m4.n1) obj).k(this.f8107b);
                return;
            default:
                ((m4.n1) obj).G0(this.f8107b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f8107b);
    }

    @Override
    public String e(int i10) {
        int i11 = this.f8106a;
        int i12 = this.f8107b;
        switch (i11) {
            case 8:
                if (i10 == 0) {
                    return dd.L0(2131748546, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i10);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i12) {
                    return dd.D0().z0().format(epochMilli) + ", " + dd.D0().v0().format(epochMilli);
                }
                return dd.D0().x0().format(epochMilli);
            default:
                if (i10 == i12) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i10));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f8106a) {
            case 0:
                ((b2.d1) obj).c(this.f8107b);
                return;
            default:
                ((b2.d1) obj).a(this.f8107b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f8107b;
    }
}
