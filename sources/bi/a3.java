package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class a3 implements Runnable {
    public final int f2748a;
    public final Runnable f2749b;

    public a3(int i10, Runnable runnable) {
        this.f2748a = i10;
        this.f2749b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f2748a) {
            case 0:
                Runnable runnable = this.f2749b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f2749b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f2749b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f2749b);
                return;
        }
    }
}
