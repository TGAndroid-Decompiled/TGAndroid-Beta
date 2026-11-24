package defpackage;
public final class j21 implements Runnable {
    public final byte a;
    public final y21 b;

    public j21(y21 y21Var, byte b) {
        this.a = b;
        this.b = y21Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        y21 y21Var = this.b;
        switch (b) {
            case 0:
                y21Var.onExitTransitionStart();
                return;
            case 1:
                y21Var.onEnterTransitionStart();
                return;
            default:
                try {
                    y21Var.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
