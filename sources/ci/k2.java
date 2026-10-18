package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class k2 implements Runnable {
    public final int f5561a;
    public final Runnable f5562b;

    public k2(int i10, Runnable runnable) {
        this.f5561a = i10;
        this.f5562b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5561a) {
            case 0:
                Runnable runnable = this.f5562b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f5562b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f5562b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            case 3:
                ConnectionsManager.lambda$cancelRequest$9(this.f5562b);
                return;
            default:
                this.f5562b.run();
                return;
        }
    }
}
