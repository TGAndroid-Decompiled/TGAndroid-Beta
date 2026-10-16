package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class wa implements Runnable {
    public final int f8069a;
    public final Utilities.Callback f8070b;

    public wa(int i10, Utilities.Callback callback) {
        this.f8069a = i10;
        this.f8070b = callback;
    }

    @Override
    public final void run() {
        switch (this.f8069a) {
            case 0:
                this.f8070b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wa(3, this.f8070b));
                return;
            case 2:
                this.f8070b.run(null);
                return;
            default:
                this.f8070b.run(null);
                return;
        }
    }
}
