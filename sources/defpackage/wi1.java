package defpackage;
public final class wi1 implements Runnable {
    public final byte a;
    public final fj1 b;

    public wi1(fj1 fj1Var, byte b) {
        this.a = b;
        this.b = fj1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        fj1 fj1Var = this.b;
        switch (b) {
            case 0:
                fj1Var.m0(true);
                return;
            case 1:
                fj1Var.l0 = true;
                fj1Var.n0();
                return;
            case 2:
                fj1Var.E = null;
                fj1Var.F = null;
                fj1Var.n0 = null;
                fj1Var.o0 = null;
                fj1Var.q0 = null;
                fj1Var.p0 = null;
                fj1Var.r0 = 0.0d;
                fj1Var.j0(false, true);
                fj1Var.f.m(null, null, fj1Var.w, null);
                fj1Var.n.setAnimation(fj1Var.L);
                fj1Var.L.H(0);
                return;
            default:
                fj1Var.l0 = true;
                if (fj1Var.y.length() > 0) {
                    fj1Var.e0(fj1Var.y.getText().toString());
                }
                fj1Var.n0();
                return;
        }
    }
}
