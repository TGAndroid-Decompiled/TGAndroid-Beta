package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class xa implements Runnable {
    public final int f6320a;
    public final Utilities.Callback f6321b;

    public xa(int i10, Utilities.Callback callback) {
        this.f6320a = i10;
        this.f6321b = callback;
    }

    @Override
    public final void run() {
        switch (this.f6320a) {
            case 0:
                this.f6321b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new xa(3, this.f6321b));
                return;
            case 2:
                this.f6321b.run(null);
                return;
            default:
                this.f6321b.run(null);
                return;
        }
    }
}
