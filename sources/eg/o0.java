package eg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class o0 implements Runnable {
    public final int f6103a;
    public final Utilities.Callback f6104b;

    public o0(int i10, Utilities.Callback callback) {
        this.f6103a = i10;
        this.f6104b = callback;
    }

    @Override
    public final void run() {
        switch (this.f6103a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(2, this.f6104b));
                return;
            case 1:
                this.f6104b.run(null);
                return;
            case 2:
                this.f6104b.run(null);
                return;
            default:
                this.f6104b.run(LaunchActivity.U());
                return;
        }
    }
}
