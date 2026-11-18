package hi;

import org.telegram.ui.Components.lr;
public final class f6 implements Runnable {
    public final int f14655a;
    public final j6 f14656b;

    public f6(j6 j6Var, int i7) {
        this.f14655a = i7;
        this.f14656b = j6Var;
    }

    @Override
    public final void run() {
        switch (this.f14655a) {
            case 0:
                this.f14656b.c();
                return;
            default:
                j6 j6Var = this.f14656b;
                j6Var.f14813a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(lr.h).setDuration(280L).start();
                j6Var.f14815c = System.currentTimeMillis();
                j6Var.invalidate();
                try {
                    j6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(j6Var.h, 59500L);
                return;
        }
    }
}
