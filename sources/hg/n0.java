package hg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class n0 implements Runnable {
    public final int f7572a;
    public final Utilities.Callback f7573b;

    public n0(int i10, Utilities.Callback callback) {
        this.f7572a = i10;
        this.f7573b = callback;
    }

    @Override
    public final void run() {
        switch (this.f7572a) {
            case 0:
                AndroidUtilities.runOnUIThread(new n0(2, this.f7573b));
                return;
            case 1:
                this.f7573b.run(null);
                return;
            case 2:
                this.f7573b.run(null);
                return;
            default:
                this.f7573b.run(LaunchActivity.U());
                return;
        }
    }
}
