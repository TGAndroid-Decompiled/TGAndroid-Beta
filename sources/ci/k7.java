package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hs;
public final class k7 implements Runnable {
    public final int f5321a;
    public final o7 f5322b;

    public k7(o7 o7Var, int i10) {
        this.f5321a = i10;
        this.f5322b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f5321a) {
            case 0:
                this.f5322b.c();
                return;
            default:
                o7 o7Var = this.f5322b;
                o7Var.f5680a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(hs.h).setDuration(280L).start();
                o7Var.f5682c = System.currentTimeMillis();
                o7Var.invalidate();
                try {
                    o7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(o7Var.h, 59500L);
                return;
        }
    }
}
