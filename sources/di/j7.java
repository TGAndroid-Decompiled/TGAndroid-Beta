package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.es;
public final class j7 implements Runnable {
    public final int f7119a;
    public final n7 f7120b;

    public j7(n7 n7Var, int i10) {
        this.f7119a = i10;
        this.f7120b = n7Var;
    }

    @Override
    public final void run() {
        switch (this.f7119a) {
            case 0:
                this.f7120b.c();
                return;
            default:
                n7 n7Var = this.f7120b;
                n7Var.f7459a.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(es.h).setDuration(280L).start();
                n7Var.f7461c = System.currentTimeMillis();
                n7Var.invalidate();
                try {
                    n7Var.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                AndroidUtilities.runOnUIThread(n7Var.h, 59500L);
                return;
        }
    }
}
