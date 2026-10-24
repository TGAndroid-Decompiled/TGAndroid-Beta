package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zr;
public final class a7 implements Runnable {
    public final int f8701a;
    public final e7 f8702b;

    public a7(e7 e7Var, int i10) {
        this.f8701a = i10;
        this.f8702b = e7Var;
    }

    @Override
    public final void run() {
        switch (this.f8701a) {
            case 0:
                this.f8702b.c();
                return;
            default:
                e7 e7Var = this.f8702b;
                e7Var.f8972a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(zr.h).setDuration(280L).start();
                e7Var.f8974c = System.currentTimeMillis();
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
