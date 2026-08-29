package jh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.p01;
public final class k8 implements Runnable {
    public final int f12393a;
    public final Runnable f12394b;
    public final Runnable f12395c;

    public k8(Runnable runnable, Runnable runnable2, int i10) {
        this.f12393a = i10;
        this.f12394b = runnable;
        this.f12395c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f12393a) {
            case 0:
                this.f12394b.run();
                this.f12395c.run();
                return;
            default:
                p01.b(this.f12394b);
                Runnable runnable = this.f12395c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
