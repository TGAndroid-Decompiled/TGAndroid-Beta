package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t11;
public final class fb implements Runnable {
    public final int f1309a;
    public final Runnable f1310b;
    public final Runnable f1311c;

    public fb(Runnable runnable, Runnable runnable2, int i10) {
        this.f1309a = i10;
        this.f1310b = runnable;
        this.f1311c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f1309a) {
            case 0:
                this.f1310b.run();
                this.f1311c.run();
                return;
            default:
                t11.b(this.f1310b);
                Runnable runnable = this.f1311c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
