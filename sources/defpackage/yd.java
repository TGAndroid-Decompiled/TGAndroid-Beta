package defpackage;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
public final class yd implements dq7, o69, b86, ot2 {
    public final byte a;
    public final int b;

    public yd(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        og8 og8Var = (og8) obj;
        switch (b) {
            case 6:
                og8Var.e0(i);
                return;
            case 7:
                og8Var.K(i);
                return;
            case 8:
                og8Var.n0(i);
                return;
            default:
                og8Var.I0(i);
                return;
        }
    }

    @Override
    public final String c(int i) {
        byte b = this.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                if (i == i2) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i));
            default:
                if (i == 0) {
                    return ob6.M0(2131748285, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i2) {
                    return ob6.D0().z0().format(epochMilli) + ", " + ob6.D0().v0().format(epochMilli);
                }
                return ob6.D0().x0().format(epochMilli);
        }
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        bg8 bg8Var = (bg8) obj;
        switch (b) {
            case 3:
                bg8Var.g(i);
                return;
            default:
                bg8Var.d(i);
                return;
        }
    }

    @Override
    public final int run() {
        return this.b;
    }
}
