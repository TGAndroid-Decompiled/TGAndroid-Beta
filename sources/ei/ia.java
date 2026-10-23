package ei;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ia implements Runnable {
    public final int f9220a;
    public final Utilities.Callback f9221b;

    public ia(int i10, Utilities.Callback callback) {
        this.f9220a = i10;
        this.f9221b = callback;
    }

    @Override
    public final void run() {
        switch (this.f9220a) {
            case 0:
                this.f9221b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ia(3, this.f9221b));
                return;
            case 2:
                this.f9221b.run(null);
                return;
            default:
                this.f9221b.run(null);
                return;
        }
    }
}
