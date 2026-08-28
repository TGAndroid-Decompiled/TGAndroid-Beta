package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class e2 implements Runnable {
    public final int f11348a;
    public final Runnable f11349b;

    public e2(int i9, Runnable runnable) {
        this.f11348a = i9;
        this.f11349b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f11348a) {
            case 0:
                Runnable runnable = this.f11349b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f11349b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f11349b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f11349b);
                return;
        }
    }
}
