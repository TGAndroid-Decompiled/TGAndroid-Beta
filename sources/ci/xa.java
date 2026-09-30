package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class xa implements Runnable {
    public final int f5859a;
    public final Utilities.Callback f5860b;

    public xa(int i10, Utilities.Callback callback) {
        this.f5859a = i10;
        this.f5860b = callback;
    }

    @Override
    public final void run() {
        switch (this.f5859a) {
            case 0:
                this.f5860b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xa(3, this.f5860b));
                return;
            case 2:
                this.f5860b.run(null);
                return;
            default:
                this.f5860b.run(null);
                return;
        }
    }
}
