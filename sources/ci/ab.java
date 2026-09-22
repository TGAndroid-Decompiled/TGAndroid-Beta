package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ab implements Runnable {
    public final int f4364a;
    public final Utilities.Callback f4365b;

    public ab(int i10, Utilities.Callback callback) {
        this.f4364a = i10;
        this.f4365b = callback;
    }

    @Override
    public final void run() {
        switch (this.f4364a) {
            case 0:
                this.f4365b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ab(3, this.f4365b));
                return;
            case 2:
                this.f4365b.run(null);
                return;
            default:
                this.f4365b.run(null);
                return;
        }
    }
}
