package defpackage;
public final class ef1 implements Runnable {
    public final byte a;
    public final wf1 b;

    public ef1(wf1 wf1Var, byte b) {
        this.a = b;
        this.b = wf1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wf1 wf1Var = this.b;
        switch (b) {
            case 0:
                wf1Var.H0 = Integer.MAX_VALUE;
                wf1Var.i1();
                wf1Var.I0 = null;
                return;
            case 1:
                wf1Var.a1(false);
                wf1Var.F.f();
                return;
            default:
                wf1Var.Z0();
                return;
        }
    }
}
