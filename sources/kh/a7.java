package kh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class a7 implements Runnable {
    public final int f14899a;
    public final e7 f14900b;

    public a7(e7 e7Var, int i9) {
        this.f14899a = i9;
        this.f14900b = e7Var;
    }

    @Override
    public final void run() {
        switch (this.f14899a) {
            case 0:
                this.f14900b.c();
                return;
            default:
                e7 e7Var = this.f14900b;
                e7Var.f15153a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(gr.h).setDuration(280L).start();
                e7Var.f15155c = System.currentTimeMillis();
                e7Var.invalidate();
                try {
                    e7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(e7Var.h, 59500L);
                return;
        }
    }
}
