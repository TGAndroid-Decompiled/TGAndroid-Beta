package defpackage;
public final class te1 implements Runnable {
    public final byte a;
    public final nf1 b;

    public te1(nf1 nf1Var, byte b) {
        this.a = b;
        this.b = nf1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        nf1 nf1Var = this.b;
        switch (b) {
            case 0:
                nf1Var.H0 = Integer.MAX_VALUE;
                nf1Var.h1();
                nf1Var.I0 = null;
                return;
            case 1:
                nf1Var.Z0(false);
                nf1Var.F.f();
                return;
            default:
                nf1Var.Y0();
                return;
        }
    }
}
