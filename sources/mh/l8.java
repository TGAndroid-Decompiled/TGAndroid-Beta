package mh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a11;
public final class l8 implements Runnable {
    public final int f14413a;
    public final Runnable f14414b;
    public final Runnable f14415c;

    public l8(Runnable runnable, Runnable runnable2, int i10) {
        this.f14413a = i10;
        this.f14414b = runnable;
        this.f14415c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f14413a) {
            case 0:
                this.f14414b.run();
                this.f14415c.run();
                return;
            default:
                a11.b(this.f14414b);
                Runnable runnable = this.f14415c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
