package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ab implements Runnable {
    public final int f4366a;
    public final Utilities.Callback f4367b;

    public ab(int i10, Utilities.Callback callback) {
        this.f4366a = i10;
        this.f4367b = callback;
    }

    @Override
    public final void run() {
        switch (this.f4366a) {
            case 0:
                this.f4367b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ab(3, this.f4367b));
                return;
            case 2:
                this.f4367b.run(null);
                return;
            default:
                this.f4367b.run(null);
                return;
        }
    }
}
