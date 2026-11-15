package hi;

import org.telegram.ui.Components.er;
public final class g6 implements Runnable {
    public final int f14343a;
    public final k6 f14344b;

    public g6(k6 k6Var, int i7) {
        this.f14343a = i7;
        this.f14344b = k6Var;
    }

    @Override
    public final void run() {
        switch (this.f14343a) {
            case 0:
                this.f14344b.c();
                return;
            default:
                k6 k6Var = this.f14344b;
                k6Var.f14504a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(er.h).setDuration(280L).start();
                k6Var.f14506c = System.currentTimeMillis();
                k6Var.invalidate();
                try {
                    k6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.i3(k6Var.h, 59500L);
                return;
        }
    }
}
