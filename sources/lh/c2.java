package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class c2 implements Runnable {
    public final int f15420a;
    public final Runnable f15421b;

    public c2(int i10, Runnable runnable) {
        this.f15420a = i10;
        this.f15421b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15420a) {
            case 0:
                Runnable runnable = this.f15421b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f15421b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f15421b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f15421b);
                return;
        }
    }
}
