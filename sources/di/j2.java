package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class j2 implements Runnable {
    public final int f8692a;
    public final Runnable f8693b;

    public j2(int i10, Runnable runnable) {
        this.f8692a = i10;
        this.f8693b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f8692a) {
            case 0:
                Runnable runnable = this.f8693b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f8693b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f8693b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            case 3:
                ConnectionsManager.lambda$cancelRequest$9(this.f8693b);
                return;
            default:
                this.f8693b.run();
                return;
        }
    }
}
