package fi;

import org.telegram.ui.Components.wq;
public final class h6 implements Runnable {
    public final int f12138a;
    public final l6 f12139b;

    public h6(l6 l6Var, int i7) {
        this.f12138a = i7;
        this.f12139b = l6Var;
    }

    @Override
    public final void run() {
        switch (this.f12138a) {
            case 0:
                this.f12139b.c();
                return;
            default:
                l6 l6Var = this.f12139b;
                l6Var.f12328a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(wq.h).setDuration(280L).start();
                l6Var.f12330c = System.currentTimeMillis();
                l6Var.invalidate();
                try {
                    l6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.i3(l6Var.h, 59500L);
                return;
        }
    }
}
