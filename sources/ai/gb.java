package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x11;
public final class gb implements Runnable {
    public final int f1361a;
    public final Runnable f1362b;
    public final Runnable f1363c;

    public gb(Runnable runnable, Runnable runnable2, int i10) {
        this.f1361a = i10;
        this.f1362b = runnable;
        this.f1363c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f1361a) {
            case 0:
                this.f1362b.run();
                this.f1363c.run();
                return;
            default:
                x11.b(this.f1362b);
                Runnable runnable = this.f1363c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
