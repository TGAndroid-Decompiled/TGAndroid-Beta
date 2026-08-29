package lh;

import org.telegram.messenger.AndroidUtilities;
public final class d2 implements Runnable {
    public final int f15464a;
    public final Runnable f15465b;
    public final long f15466c;

    public d2(int i10, long j10, Runnable runnable) {
        this.f15464a = i10;
        this.f15465b = runnable;
        this.f15466c = j10;
    }

    @Override
    public final void run() {
        switch (this.f15464a) {
            case 0:
                Runnable runnable = this.f15465b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f15466c)));
                return;
            case 1:
                Runnable runnable2 = this.f15465b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f15466c)));
                return;
            default:
                Runnable runnable3 = this.f15465b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f15466c)));
                return;
        }
    }
}
