package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class a7 implements Runnable {
    public final int f8693a;
    public final e7 f8694b;

    public a7(e7 e7Var, int i10) {
        this.f8693a = i10;
        this.f8694b = e7Var;
    }

    @Override
    public final void run() {
        switch (this.f8693a) {
            case 0:
                this.f8694b.c();
                return;
            default:
                e7 e7Var = this.f8694b;
                e7Var.f8962a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.h).setDuration(280L).start();
                e7Var.f8964c = System.currentTimeMillis();
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
