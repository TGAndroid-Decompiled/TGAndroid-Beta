package defpackage;
public final class dc6 implements Runnable {
    public final byte a;
    public final uc6 b;

    public dc6(uc6 uc6Var, byte b) {
        this.a = b;
        this.b = uc6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uc6 uc6Var = this.b;
        switch (b) {
            case 0:
                uc6Var.t0();
                return;
            case 1:
                sj5 sj5Var = uc6Var.G;
                if (sj5Var != null) {
                    uc6Var.F.h(sj5Var);
                    uc6Var.G = null;
                    return;
                }
                return;
            case 2:
                uc6Var.x0();
                return;
            case 3:
                uc6Var.getLocationController().o(0, uc6Var.m0, true);
                uc6Var.y = false;
                return;
            case 4:
                x05 x05Var = uc6Var.F;
                if (x05Var != null) {
                    x05Var.n(hl.L(70.0f), 0, hl.L(70.0f), uc6Var.n0());
                }
                if (!uc6Var.O.getRadiusSet()) {
                    double d = uc6Var.M;
                    int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
                    ym4 ym4Var = uc6Var.L;
                    if (i > 0) {
                        ym4Var.R0(d);
                    } else if (ym4Var != null) {
                        ym4Var.H0();
                        uc6Var.L = null;
                    }
                }
                uc6Var.O = null;
                return;
            case 5:
                uc6Var.D0();
                return;
            case 6:
                uc6Var.D0();
                return;
            default:
                hl.c3(new dc6(uc6Var, (byte) 1));
                return;
        }
    }
}
