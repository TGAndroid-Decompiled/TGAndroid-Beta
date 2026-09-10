package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class jc implements Runnable {
    public final int f2973a;
    public final Utilities.Callback f2974b;

    public jc(int i10, Utilities.Callback callback) {
        this.f2973a = i10;
        this.f2974b = callback;
    }

    @Override
    public final void run() {
        switch (this.f2973a) {
            case 0:
                this.f2974b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new jc(3, this.f2974b));
                return;
            case 2:
                this.f2974b.run(null);
                return;
            default:
                this.f2974b.run(null);
                return;
        }
    }
}
