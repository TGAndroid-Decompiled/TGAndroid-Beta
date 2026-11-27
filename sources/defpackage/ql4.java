package defpackage;
public final class ql4 implements Runnable {
    public final byte a;
    public final xl4 b;

    public ql4(xl4 xl4Var, byte b) {
        this.a = b;
        this.b = xl4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        xl4 xl4Var = this.b;
        switch (b) {
            case 0:
                xl4Var.t();
                if (xl4Var.b.i()) {
                    hl.d3(this, 500L);
                    return;
                }
                return;
            default:
                if (xl4Var.b.H()) {
                    hl.d3(this, 1500L);
                    return;
                }
                xl4Var.x = false;
                xl4Var.q(false);
                xl4Var.z = false;
                return;
        }
    }
}
