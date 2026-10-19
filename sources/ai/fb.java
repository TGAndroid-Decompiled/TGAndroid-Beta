package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u11;
public final class fb implements Runnable {
    public final int f1304a;
    public final Runnable f1305b;
    public final Runnable f1306c;

    public fb(Runnable runnable, Runnable runnable2, int i10) {
        this.f1304a = i10;
        this.f1305b = runnable;
        this.f1306c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f1304a) {
            case 0:
                this.f1305b.run();
                this.f1306c.run();
                return;
            default:
                u11.b(this.f1305b);
                Runnable runnable = this.f1306c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
