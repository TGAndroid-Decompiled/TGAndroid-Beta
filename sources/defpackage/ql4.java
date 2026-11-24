package defpackage;
public final class ql4 implements Runnable {
    public final byte a;
    public final tl4 b;

    public ql4(tl4 tl4Var, byte b) {
        this.a = b;
        this.b = tl4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        tl4 tl4Var = this.b;
        switch (b) {
            case 0:
                tl4Var.q();
                if (tl4Var.b.i()) {
                    gm.d3(this, 500L);
                    return;
                }
                return;
            default:
                if (tl4Var.b.G()) {
                    gm.d3(this, 1500L);
                    return;
                }
                tl4Var.u = false;
                tl4Var.o(false);
                tl4Var.w = false;
                return;
        }
    }
}
