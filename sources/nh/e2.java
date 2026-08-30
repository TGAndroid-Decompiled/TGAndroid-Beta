package nh;

import org.telegram.messenger.AndroidUtilities;
public final class e2 implements Runnable {
    public final int f15302a;
    public final Runnable f15303b;
    public final long f15304c;

    public e2(int i10, long j10, Runnable runnable) {
        this.f15302a = i10;
        this.f15303b = runnable;
        this.f15304c = j10;
    }

    @Override
    public final void run() {
        switch (this.f15302a) {
            case 0:
                Runnable runnable = this.f15303b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f15304c)));
                return;
            case 1:
                Runnable runnable2 = this.f15303b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f15304c)));
                return;
            default:
                Runnable runnable3 = this.f15303b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f15304c)));
                return;
        }
    }
}
