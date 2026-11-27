package defpackage;
public final class z31 implements Runnable {
    public final byte a;
    public final g41 b;

    public z31(g41 g41Var, byte b) {
        this.a = b;
        this.b = g41Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        g41 g41Var = this.b;
        switch (b) {
            case 0:
                g41Var.i0();
                return;
            case 1:
                g41Var.m0();
                return;
            default:
                z31 z31Var = g41Var.e;
                hl.r(z31Var);
                hl.d3(z31Var, 5000L);
                return;
        }
    }
}
