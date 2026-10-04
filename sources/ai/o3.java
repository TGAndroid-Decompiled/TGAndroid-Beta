package ai;

import org.telegram.messenger.AndroidUtilities;
public final class o3 implements Runnable {
    public final int f1453a;
    public final Runnable f1454b;
    public final long f1455c;

    public o3(int i10, long j3, Runnable runnable) {
        this.f1453a = i10;
        this.f1454b = runnable;
        this.f1455c = j3;
    }

    @Override
    public final void run() {
        switch (this.f1453a) {
            case 0:
                Runnable runnable = this.f1454b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1455c)));
                return;
            case 1:
                Runnable runnable2 = this.f1454b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1455c)));
                return;
            default:
                Runnable runnable3 = this.f1454b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f1455c)));
                return;
        }
    }
}
