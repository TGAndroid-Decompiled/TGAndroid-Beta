package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.h21;
public final class fb implements Runnable {
    public final int f4619a;
    public final Runnable f4620b;
    public final Runnable f4621c;

    public fb(Runnable runnable, Runnable runnable2, int i10) {
        this.f4619a = i10;
        this.f4620b = runnable;
        this.f4621c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f4619a) {
            case 0:
                this.f4620b.run();
                this.f4621c.run();
                return;
            default:
                h21.b(this.f4620b);
                Runnable runnable = this.f4621c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
