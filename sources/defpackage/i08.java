package defpackage;
public final class i08 implements Runnable {
    public final byte a;
    public final t08 b;

    public i08(t08 t08Var, byte b) {
        this.a = b;
        this.b = t08Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t08 t08Var = this.b;
        switch (b) {
            case 0:
                if (t08Var.H) {
                    t08Var.b.invalidate();
                    return;
                }
                return;
            case 1:
                t08Var.h();
                return;
            case 2:
                int i = t08.r0;
                t08Var.h();
                return;
            default:
                int i2 = t08.r0;
                t08Var.h();
                return;
        }
    }
}
