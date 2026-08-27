package cg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

public final class o0 implements Runnable {

    public final int f2788a;

    public final Utilities.Callback f2789b;

    public o0(int i10, Utilities.Callback callback) {
        this.f2788a = i10;
        this.f2789b = callback;
    }

    @Override
    public final void run() {
        switch (this.f2788a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(2, this.f2789b));
                break;
            case 1:
                this.f2789b.run(null);
                break;
            case 2:
                this.f2789b.run(null);
                break;
            default:
                this.f2789b.run(LaunchActivity.U());
                break;
        }
    }
}
