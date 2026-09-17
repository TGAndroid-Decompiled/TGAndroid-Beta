package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ab implements Runnable {
    public final int f4365a;
    public final Utilities.Callback f4366b;

    public ab(int i10, Utilities.Callback callback) {
        this.f4365a = i10;
        this.f4366b = callback;
    }

    @Override
    public final void run() {
        switch (this.f4365a) {
            case 0:
                this.f4366b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ab(3, this.f4366b));
                return;
            case 2:
                this.f4366b.run(null);
                return;
            default:
                this.f4366b.run(null);
                return;
        }
    }
}
