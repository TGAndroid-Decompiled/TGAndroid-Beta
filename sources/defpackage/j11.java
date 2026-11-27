package defpackage;
public final class j11 implements Runnable {
    public final byte a;
    public final z11 b;

    public j11(z11 z11Var, byte b) {
        this.a = b;
        this.b = z11Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z11 z11Var = this.b;
        switch (b) {
            case 0:
                z11Var.onExitTransitionStart();
                return;
            case 1:
                z11Var.onEnterTransitionStart();
                return;
            default:
                try {
                    z11Var.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
