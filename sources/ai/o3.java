package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class o3 implements Runnable {
    public final int f1523a;
    public final Runnable f1524b;

    public o3(int i10, Runnable runnable) {
        this.f1523a = i10;
        this.f1524b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f1523a) {
            case 0:
                Runnable runnable = this.f1524b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f1524b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f1524b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            case 3:
                ConnectionsManager.lambda$cancelRequest$9(this.f1524b);
                return;
            default:
                this.f1524b.run();
                return;
        }
    }
}
