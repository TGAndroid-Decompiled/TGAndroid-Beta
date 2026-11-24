package defpackage;
public final class xk9 implements Runnable {
    public final byte a;
    public final bl9 b;

    public xk9(bl9 bl9Var, byte b) {
        this.a = b;
        this.b = bl9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bl9 bl9Var = this.b;
        switch (b) {
            case 0:
                bl9Var.c();
                return;
            default:
                bl9Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(s33.h).setDuration(280L).start();
                bl9Var.c = System.currentTimeMillis();
                bl9Var.invalidate();
                try {
                    bl9Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                gl.e3(bl9Var.h, 59500L);
                return;
        }
    }
}
