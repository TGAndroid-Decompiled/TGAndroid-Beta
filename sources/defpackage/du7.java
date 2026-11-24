package defpackage;
public final class du7 implements Runnable {
    public final byte a;
    public final gu7 b;

    public du7(gu7 gu7Var, byte b) {
        this.a = b;
        this.b = gu7Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        gu7 gu7Var = this.b;
        switch (b) {
            case 0:
                gu7Var.c = null;
                u39 u39Var = gu7Var.a;
                if (u39Var != null) {
                    u39Var.i0();
                    return;
                }
                return;
            default:
                gu7Var.b();
                return;
        }
    }
}
