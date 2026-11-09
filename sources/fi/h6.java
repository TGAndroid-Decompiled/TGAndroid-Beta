package fi;

import org.telegram.ui.Components.xq;
public final class h6 implements Runnable {
    public final int f12134a;
    public final l6 f12135b;

    public h6(l6 l6Var, int i7) {
        this.f12134a = i7;
        this.f12135b = l6Var;
    }

    @Override
    public final void run() {
        switch (this.f12134a) {
            case 0:
                this.f12135b.c();
                return;
            default:
                l6 l6Var = this.f12135b;
                l6Var.f12327a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(xq.h).setDuration(280L).start();
                l6Var.f12329c = System.currentTimeMillis();
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
