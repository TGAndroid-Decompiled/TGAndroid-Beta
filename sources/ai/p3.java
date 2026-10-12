package ai;

import org.telegram.messenger.AndroidUtilities;
public final class p3 implements Runnable {
    public final int f1563a;
    public final Runnable f1564b;
    public final long f1565c;

    public p3(int i10, long j3, Runnable runnable) {
        this.f1563a = i10;
        this.f1564b = runnable;
        this.f1565c = j3;
    }

    @Override
    public final void run() {
        switch (this.f1563a) {
            case 0:
                Runnable runnable = this.f1564b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1565c)));
                return;
            case 1:
                Runnable runnable2 = this.f1564b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1565c)));
                return;
            default:
                Runnable runnable3 = this.f1564b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1565c)));
                return;
        }
    }
}
