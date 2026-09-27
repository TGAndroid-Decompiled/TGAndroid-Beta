package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class wa implements Runnable {
    public final int f5801a;
    public final Utilities.Callback f5802b;

    public wa(int i10, Utilities.Callback callback) {
        this.f5801a = i10;
        this.f5802b = callback;
    }

    @Override
    public final void run() {
        switch (this.f5801a) {
            case 0:
                this.f5802b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wa(3, this.f5802b));
                return;
            case 2:
                this.f5802b.run(null);
                return;
            default:
                this.f5802b.run(null);
                return;
        }
    }
}
