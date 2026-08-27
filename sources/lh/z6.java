package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class z6 implements Runnable {

    public final int f17191a;

    public final d7 f17192b;

    public z6(d7 d7Var, int i10) {
        this.f17191a = i10;
        this.f17192b = d7Var;
    }

    @Override
    public final void run() {
        switch (this.f17191a) {
            case 0:
                this.f17192b.c();
                break;
            default:
                d7 d7Var = this.f17192b;
                d7Var.f15860a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(er.h).setDuration(280L).start();
                d7Var.f15862c = System.currentTimeMillis();
                d7Var.invalidate();
                try {
                    d7Var.performHapticFeedback(3);
                    break;
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(d7Var.h, 59500L);
                break;
        }
    }
}
