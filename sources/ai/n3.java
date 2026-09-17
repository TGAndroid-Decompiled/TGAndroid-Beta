package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class n3 implements Runnable {
    public final int f1283a;
    public final Runnable f1284b;

    public n3(int i10, Runnable runnable) {
        this.f1283a = i10;
        this.f1284b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1283a) {
            case 0:
                Runnable runnable = this.f1284b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f1284b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f1284b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f1284b);
                return;
        }
    }
}
