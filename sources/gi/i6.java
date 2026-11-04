package gi;

import org.telegram.ui.Components.xq;
public final class i6 implements Runnable {
    public final int f12972a;
    public final m6 f12973b;

    public i6(m6 m6Var, int i3) {
        this.f12972a = i3;
        this.f12973b = m6Var;
    }

    @Override
    public final void run() {
        switch (this.f12972a) {
            case 0:
                this.f12973b.c();
                return;
            default:
                m6 m6Var = this.f12973b;
                m6Var.f13243a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(xq.h).setDuration(280L).start();
                m6Var.f13245c = System.currentTimeMillis();
                m6Var.invalidate();
                try {
                    m6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.i3(m6Var.h, 59500L);
                return;
        }
    }
}
