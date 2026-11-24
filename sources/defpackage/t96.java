package defpackage;
public final class t96 implements Runnable {
    public final byte a;
    public final qa6 b;

    public t96(qa6 qa6Var, byte b) {
        this.a = b;
        this.b = qa6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qa6 qa6Var = this.b;
        switch (b) {
            case 0:
                qa6Var.t0();
                return;
            case 1:
                qh5 qh5Var = qa6Var.G;
                if (qh5Var != null) {
                    qa6Var.F.h(qh5Var);
                    qa6Var.G = null;
                    return;
                }
                return;
            case 2:
                qa6Var.w0();
                return;
            case 3:
                qa6Var.getLocationController().o(0, qa6Var.m0, true);
                qa6Var.y = false;
                return;
            case 4:
                ty4 ty4Var = qa6Var.F;
                if (ty4Var != null) {
                    ty4Var.n(gl.L(70.0f), 0, gl.L(70.0f), qa6Var.n0());
                }
                if (!qa6Var.O.getRadiusSet()) {
                    double d = qa6Var.M;
                    int i = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
                    sk4 sk4Var = qa6Var.L;
                    if (i > 0) {
                        sk4Var.n0(d);
                    } else if (sk4Var != null) {
                        sk4Var.h0();
                        qa6Var.L = null;
                    }
                }
                qa6Var.O = null;
                return;
            case 5:
                qa6Var.C0();
                return;
            case 6:
                qa6Var.C0();
                return;
            default:
                gl.c3(new t96(qa6Var, (byte) 1));
                return;
        }
    }
}
