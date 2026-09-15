package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class m7 implements Runnable {
    public final int f5041a;
    public final q7 f5042b;

    public m7(q7 q7Var, int i10) {
        this.f5041a = i10;
        this.f5042b = q7Var;
    }

    @Override
    public final void run() {
        switch (this.f5041a) {
            case 0:
                this.f5042b.c();
                return;
            default:
                q7 q7Var = this.f5042b;
                q7Var.f5344a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(qr.h).setDuration(280L).start();
                q7Var.f5346c = System.currentTimeMillis();
                q7Var.invalidate();
                try {
                    q7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(q7Var.h, 59500L);
                return;
        }
    }
}
