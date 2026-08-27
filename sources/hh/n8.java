package hh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;

public final class n8 implements Runnable {

    public final int f9789a;

    public final Runnable f9790b;

    public final Runnable f9791c;

    public n8(Runnable runnable, Runnable runnable2, int i10) {
        this.f9789a = i10;
        this.f9790b = runnable;
        this.f9791c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f9789a) {
            case 0:
                this.f9790b.run();
                this.f9791c.run();
                break;
            default:
                f01.b(this.f9790b);
                Runnable runnable = this.f9791c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                }
                break;
        }
    }
}
