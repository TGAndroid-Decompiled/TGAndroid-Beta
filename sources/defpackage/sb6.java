package defpackage;
public final class sb6 implements Runnable {
    public final byte a;
    public final pc6 b;

    public sb6(pc6 pc6Var, byte b) {
        this.a = b;
        this.b = pc6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pc6 pc6Var = this.b;
        switch (b) {
            case 0:
                pc6Var.u0();
                return;
            case 1:
                pj5 pj5Var = pc6Var.G;
                if (pj5Var != null) {
                    pc6Var.F.h(pj5Var);
                    pc6Var.G = null;
                    return;
                }
                return;
            case 2:
                pc6Var.x0();
                return;
            case 3:
                pc6Var.getLocationController().o(0, pc6Var.m0, true);
                pc6Var.y = false;
                return;
            case 4:
                s05 s05Var = pc6Var.F;
                if (s05Var != null) {
                    s05Var.n(gm.L(70.0f), 0, gm.L(70.0f), pc6Var.o0());
                }
                if (!pc6Var.O.getRadiusSet()) {
                    double d = pc6Var.M;
                    int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
                    mj4 mj4Var = pc6Var.L;
                    if (i > 0) {
                        mj4Var.A(d);
                    } else if (mj4Var != null) {
                        mj4Var.y();
                        pc6Var.L = null;
                    }
                }
                pc6Var.O = null;
                return;
            case 5:
                pc6Var.D0();
                return;
            case 6:
                pc6Var.D0();
                return;
            default:
                gm.c3(new sb6(pc6Var, (byte) 1));
                return;
        }
    }
}
