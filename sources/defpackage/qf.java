package defpackage;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
public final class qf implements dn7, z29, x56, us2 {
    public final byte a;
    public final int b;

    public qf(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        ad8 ad8Var = (ad8) obj;
        switch (b) {
            case 5:
                ad8Var.e0(i);
                return;
            case 6:
                ad8Var.K(i);
                return;
            case 7:
                ad8Var.n0(i);
                return;
            default:
                ad8Var.I0(i);
                return;
        }
    }

    @Override
    public final String c(int i) {
        byte b = this.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                if (i == 0) {
                    return k96.M0(2131748339, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i2) {
                    return k96.D0().z0().format(epochMilli) + ", " + k96.D0().v0().format(epochMilli);
                }
                return k96.D0().x0().format(epochMilli);
            default:
                if (i == i2) {
                    return "—";
                }
                return String.format("%02d", Integer.valueOf(i));
        }
    }

    @Override
    public final void invoke(Object obj) {
        byte b = this.a;
        int i = this.b;
        mc8 mc8Var = (mc8) obj;
        switch (b) {
            case 3:
                mc8Var.g(i);
                return;
            default:
                mc8Var.d(i);
                return;
        }
    }

    @Override
    public final int run() {
        return this.b;
    }
}
