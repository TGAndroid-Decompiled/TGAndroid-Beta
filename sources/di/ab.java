package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ab implements Runnable {
    public final int f6919a;
    public final Utilities.Callback f6920b;

    public ab(int i10, Utilities.Callback callback) {
        this.f6919a = i10;
        this.f6920b = callback;
    }

    @Override
    public final void run() {
        switch (this.f6919a) {
            case 0:
                this.f6920b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ab(3, this.f6920b));
                return;
            case 2:
                this.f6920b.run(null);
                return;
            default:
                this.f6920b.run(null);
                return;
        }
    }
}
