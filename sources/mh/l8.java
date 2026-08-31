package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.b11;
public final class l8 implements Runnable {
    public final int f14411a;
    public final Runnable f14412b;
    public final Runnable f14413c;

    public l8(Runnable runnable, Runnable runnable2, int i10) {
        this.f14411a = i10;
        this.f14412b = runnable;
        this.f14413c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f14411a) {
            case 0:
                this.f14412b.run();
                this.f14413c.run();
                return;
            default:
                b11.b(this.f14412b);
                Runnable runnable = this.f14413c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
