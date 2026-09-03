package gg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class n0 implements Runnable {
    public final int f6708a;
    public final Utilities.Callback f6709b;

    public n0(int i10, Utilities.Callback callback) {
        this.f6708a = i10;
        this.f6709b = callback;
    }

    @Override
    public final void run() {
        switch (this.f6708a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n0(2, this.f6709b));
                return;
            case 1:
                this.f6709b.run(null);
                return;
            case 2:
                this.f6709b.run(null);
                return;
            default:
                this.f6709b.run(LaunchActivity.U());
                return;
        }
    }
}
