package ai;

import org.telegram.messenger.AndroidUtilities;
public final class o3 implements Runnable {
    public final int f1346a;
    public final Runnable f1347b;
    public final long f1348c;

    public o3(int i10, long j3, Runnable runnable) {
        this.f1346a = i10;
        this.f1347b = runnable;
        this.f1348c = j3;
    }

    @Override
    public final void run() {
        switch (this.f1346a) {
            case 0:
                Runnable runnable = this.f1347b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1348c)));
                return;
            case 1:
                Runnable runnable2 = this.f1347b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1348c)));
                return;
            default:
                Runnable runnable3 = this.f1347b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1348c)));
                return;
        }
    }
}
