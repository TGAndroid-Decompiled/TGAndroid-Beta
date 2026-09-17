package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class m7 implements Runnable {
    public final int f7673a;
    public final q7 f7674b;

    public m7(q7 q7Var, int i10) {
        this.f7673a = i10;
        this.f7674b = q7Var;
    }

    @Override
    public final void run() {
        switch (this.f7673a) {
            case 0:
                this.f7674b.c();
                return;
            default:
                q7 q7Var = this.f7674b;
                q7Var.f8030a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(pr.h).setDuration(280L).start();
                q7Var.f8032c = System.currentTimeMillis();
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
