package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class p6 implements Runnable {
    public final int f18355a;
    public final t6 f18356b;

    public p6(t6 t6Var, int i10) {
        this.f18355a = i10;
        this.f18356b = t6Var;
    }

    @Override
    public final void run() {
        switch (this.f18355a) {
            case 0:
                this.f18356b.c();
                return;
            default:
                t6 t6Var = this.f18356b;
                t6Var.f18672a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(jr.h).setDuration(280L).start();
                t6Var.f18674c = System.currentTimeMillis();
                t6Var.invalidate();
                try {
                    t6Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(t6Var.h, 59500L);
                return;
        }
    }
}
