package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u11;
public final class fb implements Runnable {
    public final int f1319a;
    public final Runnable f1320b;
    public final Runnable f1321c;

    public fb(Runnable runnable, Runnable runnable2, int i10) {
        this.f1319a = i10;
        this.f1320b = runnable;
        this.f1321c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f1319a) {
            case 0:
                this.f1320b.run();
                this.f1321c.run();
                return;
            default:
                u11.b(this.f1320b);
                Runnable runnable = this.f1321c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
