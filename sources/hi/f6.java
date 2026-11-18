package hi;

import org.telegram.ui.Components.lr;
public final class f6 implements Runnable {
    public final int f14652a;
    public final j6 f14653b;

    public f6(j6 j6Var, int i7) {
        this.f14652a = i7;
        this.f14653b = j6Var;
    }

    @Override
    public final void run() {
        switch (this.f14652a) {
            case 0:
                this.f14653b.c();
                return;
            default:
                j6 j6Var = this.f14653b;
                j6Var.f14810a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(lr.h).setDuration(280L).start();
                j6Var.f14812c = System.currentTimeMillis();
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
