package ci;

import org.telegram.messenger.AndroidUtilities;
public final class k2 implements Runnable {
    public final int f5486a;
    public final Runnable f5487b;
    public final long f5488c;

    public k2(int i10, long j10, Runnable runnable) {
        this.f5486a = i10;
        this.f5487b = runnable;
        this.f5488c = j10;
    }

    @Override
    public final void run() {
        switch (this.f5486a) {
            case 0:
                Runnable runnable = this.f5487b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5488c)));
                return;
            case 1:
                Runnable runnable2 = this.f5487b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5488c)));
                return;
            default:
                Runnable runnable3 = this.f5487b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5488c)));
                return;
        }
    }
}
