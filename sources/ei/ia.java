package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ia implements Runnable {
    public final int f9212a;
    public final Utilities.Callback f9213b;

    public ia(int i10, Utilities.Callback callback) {
        this.f9212a = i10;
        this.f9213b = callback;
    }

    @Override
    public final void run() {
        switch (this.f9212a) {
            case 0:
                this.f9213b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ia(3, this.f9213b));
                return;
            case 2:
                this.f9213b.run(null);
                return;
            default:
                this.f9213b.run(null);
                return;
        }
    }
}
