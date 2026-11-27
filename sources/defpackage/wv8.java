package defpackage;
public final class wv8 implements Runnable {
    public final byte a;
    public final cw8 b;

    public wv8(cw8 cw8Var, byte b) {
        this.a = b;
        this.b = cw8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cw8 cw8Var = this.b;
        switch (b) {
            case 0:
                cw8Var.e0 = true;
                return;
            case 1:
                cw8Var.v();
                return;
            default:
                if (!cw8Var.k0) {
                    wt6 wt6Var = cw8Var.J;
                    wt6Var.getClass();
                    wt6Var.f(cw8Var);
                    return;
                }
                return;
        }
    }
}
