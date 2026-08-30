package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.a11;
public final class l8 implements Runnable {
    public final int f12778a;
    public final Runnable f12779b;
    public final Runnable f12780c;

    public l8(Runnable runnable, Runnable runnable2, int i10) {
        this.f12778a = i10;
        this.f12779b = runnable;
        this.f12780c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f12778a) {
            case 0:
                this.f12779b.run();
                this.f12780c.run();
                return;
            default:
                a11.b(this.f12779b);
                Runnable runnable = this.f12780c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
