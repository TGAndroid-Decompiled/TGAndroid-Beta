package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a11;
public final class l8 implements Runnable {
    public final int f12762a;
    public final Runnable f12763b;
    public final Runnable f12764c;

    public l8(Runnable runnable, Runnable runnable2, int i10) {
        this.f12762a = i10;
        this.f12763b = runnable;
        this.f12764c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f12762a) {
            case 0:
                this.f12763b.run();
                this.f12764c.run();
                return;
            default:
                a11.b(this.f12763b);
                Runnable runnable = this.f12764c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
