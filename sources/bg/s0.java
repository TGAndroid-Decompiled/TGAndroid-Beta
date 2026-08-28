package bg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class s0 implements Runnable {
    public final int f1952a;
    public final Utilities.Callback f1953b;

    public s0(int i9, Utilities.Callback callback) {
        this.f1952a = i9;
        this.f1953b = callback;
    }

    @Override
    public final void run() {
        switch (this.f1952a) {
            case 0:
                AndroidUtilities.runOnUIThread(new s0(2, this.f1953b));
                return;
            case 1:
                this.f1953b.run(null);
                return;
            case 2:
                this.f1953b.run(null);
                return;
            default:
                this.f1953b.run(LaunchActivity.U());
                return;
        }
    }
}
