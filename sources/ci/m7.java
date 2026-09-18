package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qr;
public final class m7 implements Runnable {
    public final int f5046a;
    public final q7 f5047b;

    public m7(q7 q7Var, int i10) {
        this.f5046a = i10;
        this.f5047b = q7Var;
    }

    @Override
    public final void run() {
        switch (this.f5046a) {
            case 0:
                this.f5047b.c();
                return;
            default:
                q7 q7Var = this.f5047b;
                q7Var.f5349a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(qr.h).setDuration(280L).start();
                q7Var.f5351c = System.currentTimeMillis();
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
