package defpackage;
public final class w21 implements Runnable {
    public final byte a;
    public final c21 b;

    public w21(c21 c21Var, byte b) {
        this.a = b;
        this.b = c21Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        c21 c21Var = this.b;
        switch (b) {
            case 0:
                c21Var.performHapticFeedback(3, 2);
                return;
            default:
                c21Var.performHapticFeedback(3, 2);
                return;
        }
    }
}
