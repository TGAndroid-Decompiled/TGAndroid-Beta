package hi;

import org.telegram.ui.Components.nr;
public final class f6 implements Runnable {
    public final int f14605a;
    public final j6 f14606b;

    public f6(j6 j6Var, int i7) {
        this.f14605a = i7;
        this.f14606b = j6Var;
    }

    @Override
    public final void run() {
        switch (this.f14605a) {
            case 0:
                this.f14606b.c();
                return;
            default:
                j6 j6Var = this.f14606b;
                j6Var.f14767a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(nr.h).setDuration(280L).start();
                j6Var.f14769c = System.currentTimeMillis();
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
