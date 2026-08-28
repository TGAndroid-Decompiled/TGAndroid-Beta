package gh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.d01;
public final class o8 implements Runnable {
    public final int f8690a;
    public final Runnable f8691b;
    public final Runnable f8692c;

    public o8(Runnable runnable, Runnable runnable2, int i9) {
        this.f8690a = i9;
        this.f8691b = runnable;
        this.f8692c = runnable2;
    }

    @Override
    public final void run() {
        switch (this.f8690a) {
            case 0:
                this.f8691b.run();
                this.f8692c.run();
                return;
            default:
                d01.b(this.f8691b);
                Runnable runnable = this.f8692c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
        }
    }
}
