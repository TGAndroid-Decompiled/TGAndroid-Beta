package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class n3 implements Runnable {
    public final int f1290a;
    public final Runnable f1291b;

    public n3(int i10, Runnable runnable) {
        this.f1290a = i10;
        this.f1291b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1290a) {
            case 0:
                Runnable runnable = this.f1291b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f1291b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f1291b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f1291b);
                return;
        }
    }
}
