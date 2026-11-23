package hi;

import org.telegram.ui.Components.nr;
public final class e6 implements Runnable {
    public final int f14596a;
    public final i6 f14597b;

    public e6(i6 i6Var, int i7) {
        this.f14596a = i7;
        this.f14597b = i6Var;
    }

    @Override
    public final void run() {
        switch (this.f14596a) {
            case 0:
                this.f14597b.c();
                return;
            default:
                i6 i6Var = this.f14597b;
                i6Var.f14791a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(nr.h).setDuration(280L).start();
                i6Var.f14793c = System.currentTimeMillis();
                i6Var.invalidate();
                try {
                    i6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(i6Var.h, 59500L);
                return;
        }
    }
}
