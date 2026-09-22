package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class n3 implements Runnable {
    public final int f1280a;
    public final Runnable f1281b;

    public n3(int i10, Runnable runnable) {
        this.f1280a = i10;
        this.f1281b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1280a) {
            case 0:
                Runnable runnable = this.f1281b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f1281b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f1281b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f1281b);
                return;
        }
    }
}
