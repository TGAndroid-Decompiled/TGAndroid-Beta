package k2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ya0;
public final class v implements g2.p, f9.k, g2.k, cj0, ya0 {
    public final int f16751a;
    public final int f16752b;

    public v(int i3, int i10) {
        this.f16751a = i10;
        this.f16752b = i3;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f16751a) {
            case 3:
                ((o4.l1) obj).e0(this.f16752b);
                return;
            case 4:
                ((o4.l1) obj).L(this.f16752b);
                return;
            case 5:
                ((o4.l1) obj).k(this.f16752b);
                return;
            default:
                ((o4.l1) obj).H0(this.f16752b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f16752b);
    }

    @Override
    public String e(int i3) {
        int i10 = this.f16751a;
        int i11 = this.f16752b;
        switch (i10) {
            case 8:
                if (i3 == 0) {
                    return bd.M0(2131748539, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i3);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i11) {
                    return bd.E0().A0().format(epochMilli) + ", " + bd.E0().w0().format(epochMilli);
                }
                return bd.E0().y0().format(epochMilli);
            default:
                if (i3 == i11) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i3));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f16751a) {
            case 0:
                ((d2.c1) obj).c(this.f16752b);
                return;
            default:
                ((d2.c1) obj).a(this.f16752b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f16752b;
    }
}
