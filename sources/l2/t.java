package l2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.pb0;
public final class t implements h2.o, g9.k, nj0, pb0, h2.j {
    public final int f19572a;
    public final int f19573b;

    public t(int i7, int i10) {
        this.f19572a = i10;
        this.f19573b = i7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19572a) {
            case 6:
                ((p4.i1) obj).i0(this.f19573b);
                return;
            case 7:
                ((p4.i1) obj).N(this.f19573b);
                return;
            case 8:
                ((p4.i1) obj).k(this.f19573b);
                return;
            default:
                ((p4.i1) obj).G0(this.f19573b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f19573b);
    }

    @Override
    public String i(int i7) {
        int i10 = this.f19572a;
        int i11 = this.f19573b;
        switch (i10) {
            case 4:
                if (i7 == 0) {
                    return gd.N0(2131748338, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i7);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i11) {
                    return gd.E0().A0().format(epochMilli) + ", " + gd.E0().w0().format(epochMilli);
                }
                return gd.E0().y0().format(epochMilli);
            default:
                if (i7 == i11) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19572a) {
            case 0:
                ((e2.a1) obj).e(this.f19573b);
                return;
            default:
                ((e2.a1) obj).d(this.f19573b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f19573b;
    }
}
