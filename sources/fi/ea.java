package fi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class ea implements Runnable {
    public final int f10837a;
    public final Utilities.Callback f10838b;

    public ea(int i10, Utilities.Callback callback) {
        this.f10837a = i10;
        this.f10838b = callback;
    }

    @Override
    public final void run() {
        switch (this.f10837a) {
            case 0:
                this.f10838b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ea(3, this.f10838b));
                return;
            case 2:
                this.f10838b.run(null);
                return;
            default:
                this.f10838b.run(null);
                return;
        }
    }
}
