package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
public final class x6 implements Runnable {
    public final int f11957a;
    public final b7 f11958b;

    public x6(b7 b7Var, int i10) {
        this.f11957a = i10;
        this.f11958b = b7Var;
    }

    @Override
    public final void run() {
        switch (this.f11957a) {
            case 0:
                this.f11958b.c();
                return;
            default:
                b7 b7Var = this.f11958b;
                b7Var.f10565a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(ds.h).setDuration(280L).start();
                b7Var.f10567c = System.currentTimeMillis();
                b7Var.invalidate();
                try {
                    b7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(b7Var.h, 59500L);
                return;
        }
    }
}
