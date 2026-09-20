package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class m7 implements Runnable {
    public final int f5047a;
    public final q7 f5048b;

    public m7(q7 q7Var, int i10) {
        this.f5047a = i10;
        this.f5048b = q7Var;
    }

    @Override
    public final void run() {
        switch (this.f5047a) {
            case 0:
                this.f5048b.c();
                return;
            default:
                q7 q7Var = this.f5048b;
                q7Var.f5350a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(qr.h).setDuration(280L).start();
                q7Var.f5352c = System.currentTimeMillis();
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
