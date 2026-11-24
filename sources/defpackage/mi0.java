package defpackage;
public final class mi0 implements Runnable {
    public final byte a;
    public final oi0 b;

    public mi0(oi0 oi0Var, byte b) {
        this.a = b;
        this.b = oi0Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        oi0 oi0Var = this.b;
        switch (b) {
            case 0:
                oi0Var.a(null, false);
                return;
            default:
                oi0Var.b(true);
                return;
        }
    }
}
