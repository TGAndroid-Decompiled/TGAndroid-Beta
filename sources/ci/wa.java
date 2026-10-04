package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public final class wa implements Runnable {
    public final int f6249a;
    public final Utilities.Callback f6250b;

    public wa(int i10, Utilities.Callback callback) {
        this.f6249a = i10;
        this.f6250b = callback;
    }

    @Override
    public final void run() {
        switch (this.f6249a) {
            case 0:
                this.f6250b.run(LaunchActivity.U());
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new wa(3, this.f6250b));
                return;
            case 2:
                this.f6250b.run(null);
                return;
            default:
                this.f6250b.run(null);
                return;
        }
    }
}
