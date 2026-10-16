package bi;

import org.telegram.messenger.AndroidUtilities;
public final class e3 implements Runnable {
    public final int f2981a;
    public final Runnable f2982b;
    public final long f2983c;

    public e3(int i10, long j10, Runnable runnable) {
        this.f2981a = i10;
        this.f2982b = runnable;
        this.f2983c = j10;
    }

    @Override
    public final void run() {
        switch (this.f2981a) {
            case 0:
                Runnable runnable = this.f2982b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2983c)));
                return;
            case 1:
                Runnable runnable2 = this.f2982b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2983c)));
                return;
            default:
                Runnable runnable3 = this.f2982b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2983c)));
                return;
        }
    }
}
