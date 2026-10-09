package ai;

import org.telegram.messenger.AndroidUtilities;
public final class p3 implements Runnable {
    public final int f1565a;
    public final Runnable f1566b;
    public final long f1567c;

    public p3(int i10, long j3, Runnable runnable) {
        this.f1565a = i10;
        this.f1566b = runnable;
        this.f1567c = j3;
    }

    @Override
    public final void run() {
        switch (this.f1565a) {
            case 0:
                Runnable runnable = this.f1566b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1567c)));
                return;
            case 1:
                Runnable runnable2 = this.f1566b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1567c)));
                return;
            default:
                Runnable runnable3 = this.f1566b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1567c)));
                return;
        }
    }
}
