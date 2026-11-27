package defpackage;
public final class xh1 implements Runnable {
    public final byte a;
    public final gi1 b;

    public xh1(gi1 gi1Var, byte b) {
        this.a = b;
        this.b = gi1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gi1 gi1Var = this.b;
        switch (b) {
            case 0:
                gi1Var.l0(true);
                return;
            case 1:
                gi1Var.l0 = true;
                gi1Var.m0();
                return;
            case 2:
                gi1Var.E = null;
                gi1Var.F = null;
                gi1Var.n0 = null;
                gi1Var.o0 = null;
                gi1Var.q0 = null;
                gi1Var.p0 = null;
                gi1Var.r0 = 0.0d;
                gi1Var.i0(false, true);
                gi1Var.f.m(null, null, gi1Var.w, null);
                gi1Var.n.setAnimation(gi1Var.L);
                gi1Var.L.H(0);
                return;
            default:
                gi1Var.l0 = true;
                if (gi1Var.y.length() > 0) {
                    gi1Var.d0(gi1Var.y.getText().toString());
                }
                gi1Var.m0();
                return;
        }
    }
}
