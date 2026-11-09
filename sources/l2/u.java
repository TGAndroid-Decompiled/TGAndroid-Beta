package l2;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
import org.telegram.messenger.id;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.zi0;
public final class u implements h2.o, g9.k, zi0, eb0, h2.j {
    public final int f18054a;
    public final int f18055b;

    public u(int i7, int i10) {
        this.f18054a = i10;
        this.f18055b = i7;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f18054a) {
            case 6:
                ((p4.g1) obj).i0(this.f18055b);
                return;
            case 7:
                ((p4.g1) obj).N(this.f18055b);
                return;
            case 8:
                ((p4.g1) obj).k(this.f18055b);
                return;
            default:
                ((p4.g1) obj).G0(this.f18055b);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Integer num = (Integer) obj;
        return Integer.valueOf(this.f18055b);
    }

    @Override
    public String h(int i7) {
        int i10 = this.f18054a;
        int i11 = this.f18055b;
        switch (i10) {
            case 4:
                if (i7 == 0) {
                    return id.M0(2131748531, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i7);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i11) {
                    return id.E0().A0().format(epochMilli) + ", " + id.E0().w0().format(epochMilli);
                }
                return id.E0().y0().format(epochMilli);
            default:
                if (i7 == i11) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f18054a) {
            case 0:
                ((e2.a1) obj).e(this.f18055b);
                return;
            default:
                ((e2.a1) obj).c(this.f18055b);
                return;
        }
    }

    @Override
    public int run() {
        return this.f18055b;
    }
}
