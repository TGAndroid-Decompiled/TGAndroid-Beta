package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class n0 implements Runnable {
    public final int f6721a;
    public final Utilities.Callback f6722b;

    public n0(int i10, Utilities.Callback callback) {
        this.f6721a = i10;
        this.f6722b = callback;
    }

    @Override
    public final void run() {
        switch (this.f6721a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n0(2, this.f6722b));
                return;
            case 1:
                this.f6722b.run(null);
                return;
            case 2:
                this.f6722b.run(null);
                return;
            default:
                this.f6722b.run(LaunchActivity.U());
                return;
        }
    }
}
