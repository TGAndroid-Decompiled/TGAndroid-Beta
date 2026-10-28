package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class j2 implements Runnable {
    public final int f8691a;
    public final Runnable f8692b;

    public j2(int i10, Runnable runnable) {
        this.f8691a = i10;
        this.f8692b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f8691a) {
            case 0:
                Runnable runnable = this.f8692b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f8692b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f8692b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            case 3:
                ConnectionsManager.lambda$cancelRequest$9(this.f8692b);
                return;
            default:
                this.f8692b.run();
                return;
        }
    }
}
