package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.is;
public final class k7 implements Runnable {
    public final int f5320a;
    public final o7 f5321b;

    public k7(o7 o7Var, int i10) {
        this.f5320a = i10;
        this.f5321b = o7Var;
    }

    @Override
    public final void run() {
        switch (this.f5320a) {
            case 0:
                this.f5321b.c();
                return;
            default:
                o7 o7Var = this.f5321b;
                o7Var.f5679a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(is.h).setDuration(280L).start();
                o7Var.f5681c = System.currentTimeMillis();
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
