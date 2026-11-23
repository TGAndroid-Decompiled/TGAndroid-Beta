package l2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.pb0;
public final class t implements h2.o, g9.k, nj0, pb0, h2.j {
    public final int f19541a;
    public final int f19542b;

    public t(int i7, int i10) {
        this.f19541a = i10;
        this.f19542b = i7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19541a) {
            case 6:
                ((p4.i1) obj).i0(this.f19542b);
                return;
            case 7:
                ((p4.i1) obj).N(this.f19542b);
                return;
            case 8:
                ((p4.i1) obj).k(this.f19542b);
                return;
            default:
                ((p4.i1) obj).G0(this.f19542b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f19542b);
    }

    @Override
    public String i(int i7) {
        int i10 = this.f19541a;
        int i11 = this.f19542b;
        switch (i10) {
            case 4:
                if (i7 == 0) {
                    return hd.N0(2131748338, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i7);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i11) {
                    return hd.E0().A0().format(epochMilli) + ", " + hd.E0().w0().format(epochMilli);
                }
                return hd.E0().y0().format(epochMilli);
            default:
                if (i7 == i11) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f19541a) {
            case 0:
                ((e2.a1) obj).e(this.f19542b);
                return;
            default:
                ((e2.a1) obj).d(this.f19542b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f19542b;
    }
}
