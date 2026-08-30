package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
public final class d2 implements Runnable {
    public final int f15177a;
    public final Runnable f15178b;

    public d2(int i10, Runnable runnable) {
        this.f15177a = i10;
        this.f15178b = runnable;
    }

    @Override
    public final void run() {
        switch (this.f15177a) {
            case 0:
                Runnable runnable = this.f15178b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable);
                return;
            case 1:
                Runnable runnable2 = this.f15178b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2);
                return;
            case 2:
                Runnable runnable3 = this.f15178b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3);
                return;
            default:
                ConnectionsManager.lambda$cancelRequest$9(this.f15178b);
                return;
        }
    }
}
