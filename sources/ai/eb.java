package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.t11;
public final class eb implements Runnable {
    public final int f1268a;
    public final Runnable f1269b;
    public final Runnable f1270c;

    public eb(Runnable runnable, Runnable runnable2, int i10) {
        this.f1268a = i10;
        this.f1269b = runnable;
        this.f1270c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f1268a) {
            case 0:
                this.f1269b.run();
                this.f1270c.run();
                return;
            default:
                t11.b(this.f1269b);
                Runnable runnable = this.f1270c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
