package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class e2 implements Runnable {
    public final int f17015a;
    public final Runnable f17016b;

    public e2(int i10, Runnable runnable) {
        this.f17015a = i10;
        this.f17016b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f17015a) {
            case 0:
                Runnable runnable = this.f17016b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f17016b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f17016b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f17016b);
                return;
        }
    }
}
