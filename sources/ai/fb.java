package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t11;
public final class fb implements Runnable {
    public final int f1310a;
    public final Runnable f1311b;
    public final Runnable f1312c;

    public fb(Runnable runnable, Runnable runnable2, int i10) {
        this.f1310a = i10;
        this.f1311b = runnable;
        this.f1312c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f1310a) {
            case 0:
                this.f1311b.run();
                this.f1312c.run();
                return;
            default:
                t11.b(this.f1311b);
                Runnable runnable = this.f1312c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
