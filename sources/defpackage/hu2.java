package defpackage;
public final class hu2 implements Runnable {
    public final byte a;
    public final tu2 b;

    public hu2(tu2 tu2Var, byte b) {
        this.a = b;
        this.b = tu2Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tu2 tu2Var = this.b;
        switch (b) {
            case 0:
                tu2Var.e0();
                return;
            case 1:
                if (tu2Var.K) {
                    tu2Var.d.d.requestFocus();
                    gm.E3(tu2Var.d.d);
                    return;
                }
                return;
            default:
                tu2Var.presentFragment(yv1.ga(tu2Var.I), true);
                return;
        }
    }
}
