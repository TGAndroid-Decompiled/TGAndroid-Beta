package ai;

import org.telegram.messenger.AndroidUtilities;
public final class o3 implements Runnable {
    public final int f1344a;
    public final Runnable f1345b;
    public final long f1346c;

    public o3(int i10, long j3, Runnable runnable) {
        this.f1344a = i10;
        this.f1345b = runnable;
        this.f1346c = j3;
    }

    @Override
    public final void run() {
        switch (this.f1344a) {
            case 0:
                Runnable runnable = this.f1345b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1346c)));
                return;
            case 1:
                Runnable runnable2 = this.f1345b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1346c)));
                return;
            default:
                Runnable runnable3 = this.f1345b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1346c)));
                return;
        }
    }
}
