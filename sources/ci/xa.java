package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class xa implements Runnable {
    public final int f5847a;
    public final Utilities.Callback f5848b;

    public xa(int i10, Utilities.Callback callback) {
        this.f5847a = i10;
        this.f5848b = callback;
    }

    @Override
    public final void run() {
        switch (this.f5847a) {
            case 0:
                this.f5848b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xa(3, this.f5848b));
                return;
            case 2:
                this.f5848b.run(null);
                return;
            default:
                this.f5848b.run(null);
                return;
        }
    }
}
