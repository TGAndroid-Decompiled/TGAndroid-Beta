package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class wa implements Runnable {
    public final int f6248a;
    public final Utilities.Callback f6249b;

    public wa(int i10, Utilities.Callback callback) {
        this.f6248a = i10;
        this.f6249b = callback;
    }

    @Override
    public final void run() {
        switch (this.f6248a) {
            case 0:
                this.f6249b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wa(3, this.f6249b));
                return;
            case 2:
                this.f6249b.run(null);
                return;
            default:
                this.f6249b.run(null);
                return;
        }
    }
}
