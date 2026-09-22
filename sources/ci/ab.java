package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ab implements Runnable {
    public final int f4362a;
    public final Utilities.Callback f4363b;

    public ab(int i10, Utilities.Callback callback) {
        this.f4362a = i10;
        this.f4363b = callback;
    }

    @Override
    public final void run() {
        switch (this.f4362a) {
            case 0:
                this.f4363b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ab(3, this.f4363b));
                return;
            case 2:
                this.f4363b.run(null);
                return;
            default:
                this.f4363b.run(null);
                return;
        }
    }
}
