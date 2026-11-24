package defpackage;
public final class v31 implements Runnable {
    public final byte a;
    public final b31 b;

    public v31(b31 b31Var, byte b) {
        this.a = b;
        this.b = b31Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        b31 b31Var = this.b;
        switch (b) {
            case 0:
                b31Var.performHapticFeedback(3, 2);
                return;
            default:
                b31Var.performHapticFeedback(3, 2);
                return;
        }
    }
}
