package defpackage;

import j$.time.LocalDate;
import j$.time.ZoneOffset;
public final class pg implements hp7, c59, x76, fu2 {
    public final byte a;
    public final int b;

    public pg(int i, byte b) {
        this.a = b;
        this.b = i;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        int i = this.b;
        cf8 cf8Var = (cf8) obj;
        switch (b) {
            case 6:
                cf8Var.e0(i);
                return;
            case 7:
                cf8Var.K(i);
                return;
            case 8:
                cf8Var.n0(i);
                return;
            default:
                cf8Var.I0(i);
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
                    return jb6.M0(2131748288, null);
                }
                LocalDate plusDays = LocalDate.now().plusDays(i);
                int year = plusDays.getYear();
                long epochMilli = plusDays.atStartOfDay().toInstant(ZoneOffset.UTC).toEpochMilli();
                if (year == i2) {
                    return jb6.D0().z0().format(epochMilli) + ", " + jb6.D0().v0().format(epochMilli);
                }
                return jb6.D0().x0().format(epochMilli);
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
        pe8 pe8Var = (pe8) obj;
        switch (b) {
            case 3:
                pe8Var.g(i);
                return;
            default:
                pe8Var.b(i);
                return;
        }
    }

    @Override
    public final int run() {
        return this.b;
    }
}
