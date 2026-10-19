package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class a7 implements Runnable {
    public final int f8692a;
    public final e7 f8693b;

    public a7(e7 e7Var, int i10) {
        this.f8692a = i10;
        this.f8693b = e7Var;
    }

    @Override
    public final void run() {
        switch (this.f8692a) {
            case 0:
                this.f8693b.c();
                return;
            default:
                e7 e7Var = this.f8693b;
                e7Var.f8961a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.h).setDuration(280L).start();
                e7Var.f8963c = System.currentTimeMillis();
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
