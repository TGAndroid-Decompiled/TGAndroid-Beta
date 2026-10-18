package ci;

import org.telegram.messenger.AndroidUtilities;
public final class k2 implements Runnable {
    public final int f5481a;
    public final Runnable f5482b;
    public final long f5483c;

    public k2(int i10, long j10, Runnable runnable) {
        this.f5481a = i10;
        this.f5482b = runnable;
        this.f5483c = j10;
    }

    @Override
    public final void run() {
        switch (this.f5481a) {
            case 0:
                Runnable runnable = this.f5482b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5483c)));
                return;
            case 1:
                Runnable runnable2 = this.f5482b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5483c)));
                return;
            default:
                Runnable runnable3 = this.f5482b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f5483c)));
                return;
        }
    }
}
