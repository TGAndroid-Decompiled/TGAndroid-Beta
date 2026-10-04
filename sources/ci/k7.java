package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
public final class k7 implements Runnable {
    public final int f5308a;
    public final o7 f5309b;

    public k7(o7 o7Var, int i10) {
        this.f5308a = i10;
        this.f5309b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f5308a) {
            case 0:
                this.f5309b.c();
                return;
            default:
                o7 o7Var = this.f5309b;
                o7Var.f5656a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(tr.h).setDuration(280L).start();
                o7Var.f5658c = System.currentTimeMillis();
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
