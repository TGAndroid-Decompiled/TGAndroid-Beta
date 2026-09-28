package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
public final class k7 implements Runnable {
    public final int f4900a;
    public final o7 f4901b;

    public k7(o7 o7Var, int i10) {
        this.f4900a = i10;
        this.f4901b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f4900a) {
            case 0:
                this.f4901b.c();
                return;
            default:
                o7 o7Var = this.f4901b;
                o7Var.f5243a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(sr.h).setDuration(280L).start();
                o7Var.f5245c = System.currentTimeMillis();
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
