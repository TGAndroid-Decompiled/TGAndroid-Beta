package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ia implements Runnable {
    public final int f9209a;
    public final Utilities.Callback f9210b;

    public ia(int i10, Utilities.Callback callback) {
        this.f9209a = i10;
        this.f9210b = callback;
    }

    @Override
    public final void run() {
        switch (this.f9209a) {
            case 0:
                this.f9210b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ia(3, this.f9210b));
                return;
            case 2:
                this.f9210b.run(null);
                return;
            default:
                this.f9210b.run(null);
                return;
        }
    }
}
