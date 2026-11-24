package defpackage;
public final class bg1 implements Runnable {
    public final byte a;
    public final vg1 b;

    public bg1(vg1 vg1Var, byte b) {
        this.a = b;
        this.b = vg1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        vg1 vg1Var = this.b;
        switch (b) {
            case 0:
                vg1Var.H0 = Integer.MAX_VALUE;
                vg1Var.i1();
                vg1Var.I0 = null;
                return;
            case 1:
                vg1Var.a1(false);
                vg1Var.F.f();
                return;
            default:
                vg1Var.Z0();
                return;
        }
    }
}
