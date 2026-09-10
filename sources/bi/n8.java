package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wr;
public final class n8 implements Runnable {
    public final int f3241a;
    public final r8 f3242b;

    public n8(r8 r8Var, int i10) {
        this.f3241a = i10;
        this.f3242b = r8Var;
    }

    @Override
    public final void run() {
        switch (this.f3241a) {
            case 0:
                this.f3242b.c();
                return;
            default:
                r8 r8Var = this.f3242b;
                r8Var.f3549a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(wr.h).setDuration(280L).start();
                r8Var.f3551c = System.currentTimeMillis();
                r8Var.invalidate();
                try {
                    r8Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(r8Var.h, 59500L);
                return;
        }
    }
}
