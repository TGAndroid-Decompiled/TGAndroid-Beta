package defpackage;
public final class ym9 implements Runnable {
    public final byte a;
    public final bn9 b;

    public ym9(bn9 bn9Var, byte b) {
        this.a = b;
        this.b = bn9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bn9 bn9Var = this.b;
        switch (b) {
            case 0:
                bn9Var.c();
                return;
            default:
                bn9Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(d53.h).setDuration(280L).start();
                bn9Var.c = System.currentTimeMillis();
                bn9Var.invalidate();
                try {
                    bn9Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                gm.d3(bn9Var.h, 59500L);
                return;
        }
    }
}
