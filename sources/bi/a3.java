package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class a3 implements Runnable {
    public final int f2775a;
    public final Runnable f2776b;

    public a3(int i10, Runnable runnable) {
        this.f2775a = i10;
        this.f2776b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f2775a) {
            case 0:
                Runnable runnable = this.f2776b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f2776b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f2776b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f2776b);
                return;
        }
    }
}
