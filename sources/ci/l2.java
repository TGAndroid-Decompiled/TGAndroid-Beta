package ci;

import org.telegram.messenger.AndroidUtilities;
public final class l2 implements Runnable {
    public final int f5578a;
    public final Runnable f5579b;
    public final long f5580c;

    public l2(int i10, long j10, Runnable runnable) {
        this.f5578a = i10;
        this.f5579b = runnable;
        this.f5580c = j10;
    }

    @Override
    public final void run() {
        switch (this.f5578a) {
            case 0:
                Runnable runnable = this.f5579b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5580c)));
                return;
            case 1:
                Runnable runnable2 = this.f5579b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5580c)));
                return;
            default:
                Runnable runnable3 = this.f5579b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5580c)));
                return;
        }
    }
}
