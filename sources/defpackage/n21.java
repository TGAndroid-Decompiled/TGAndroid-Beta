package defpackage;
public final class n21 implements Runnable {
    public final byte a;
    public final t11 b;

    public n21(t11 t11Var, byte b) {
        this.a = b;
        this.b = t11Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t11 t11Var = this.b;
        switch (b) {
            case 0:
                t11Var.performHapticFeedback(3, 2);
                return;
            default:
                t11Var.performHapticFeedback(3, 2);
                return;
        }
    }
}
