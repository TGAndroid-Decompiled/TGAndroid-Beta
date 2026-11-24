package defpackage;
public final class ns8 implements Runnable {
    public final byte a;
    public final ts8 b;

    public ns8(ts8 ts8Var, byte b) {
        this.a = b;
        this.b = ts8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ts8 ts8Var = this.b;
        switch (b) {
            case 0:
                ts8Var.e0 = true;
                return;
            case 1:
                ts8Var.u();
                return;
            default:
                if (!ts8Var.k0) {
                    rr6 rr6Var = ts8Var.J;
                    rr6Var.getClass();
                    rr6Var.b(ts8Var);
                    return;
                }
                return;
        }
    }
}
