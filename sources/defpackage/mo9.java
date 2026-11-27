package defpackage;
public final class mo9 implements Runnable {
    public final byte a;
    public final qo9 b;

    public mo9(qo9 qo9Var, byte b) {
        this.a = b;
        this.b = qo9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qo9 qo9Var = this.b;
        switch (b) {
            case 0:
                qo9Var.c();
                return;
            default:
                qo9Var.a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(k43.h).setDuration(280L).start();
                qo9Var.c = System.currentTimeMillis();
                qo9Var.invalidate();
                try {
                    qo9Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                hl.d3(qo9Var.h, 59500L);
                return;
        }
    }
}
