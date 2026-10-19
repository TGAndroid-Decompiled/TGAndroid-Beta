package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class a7 implements Runnable {
    public final int f8694a;
    public final e7 f8695b;

    public a7(e7 e7Var, int i10) {
        this.f8694a = i10;
        this.f8695b = e7Var;
    }

    @Override
    public final void run() {
        switch (this.f8694a) {
            case 0:
                this.f8695b.c();
                return;
            default:
                e7 e7Var = this.f8695b;
                e7Var.f8963a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.h).setDuration(280L).start();
                e7Var.f8965c = System.currentTimeMillis();
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
