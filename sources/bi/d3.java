package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class d3 implements Runnable {
    public final int f2946a;
    public final Runnable f2947b;

    public d3(int i10, Runnable runnable) {
        this.f2946a = i10;
        this.f2947b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f2946a) {
            case 0:
                Runnable runnable = this.f2947b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f2947b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f2947b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            case 3:
                ConnectionsManager.lambda$cancelRequest$9(this.f2947b);
                return;
            default:
                this.f2947b.run();
                return;
        }
    }
}
