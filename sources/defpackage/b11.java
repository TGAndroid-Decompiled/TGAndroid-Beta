package defpackage;
public final class b11 implements Runnable {
    public final byte a;
    public final q11 b;

    public b11(q11 q11Var, byte b) {
        this.a = b;
        this.b = q11Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        q11 q11Var = this.b;
        switch (b) {
            case 0:
                q11Var.onExitTransitionStart();
                return;
            case 1:
                q11Var.onEnterTransitionStart();
                return;
            default:
                try {
                    q11Var.performHapticFeedback(3, 2);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
