package defpackage;
public final class oh1 implements Runnable {
    public final byte a;
    public final yh1 b;

    public oh1(yh1 yh1Var, byte b) {
        this.a = b;
        this.b = yh1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yh1 yh1Var = this.b;
        switch (b) {
            case 0:
                yh1Var.l0(true);
                return;
            case 1:
                yh1Var.l0 = true;
                yh1Var.m0();
                return;
            case 2:
                yh1Var.E = null;
                yh1Var.F = null;
                yh1Var.n0 = null;
                yh1Var.o0 = null;
                yh1Var.q0 = null;
                yh1Var.p0 = null;
                yh1Var.r0 = 0.0d;
                yh1Var.i0(false, true);
                yh1Var.f.m(null, null, yh1Var.w, null);
                yh1Var.n.setAnimation(yh1Var.L);
                yh1Var.L.H(0);
                return;
            default:
                yh1Var.l0 = true;
                if (yh1Var.y.length() > 0) {
                    yh1Var.d0(yh1Var.y.getText().toString());
                }
                yh1Var.m0();
                return;
        }
    }
}
