package bi;

import org.telegram.messenger.AndroidUtilities;
public final class e3 implements Runnable {
    public final int f2977a;
    public final Runnable f2978b;
    public final long f2979c;

    public e3(int i10, long j10, Runnable runnable) {
        this.f2977a = i10;
        this.f2978b = runnable;
        this.f2979c = j10;
    }

    @Override
    public final void run() {
        switch (this.f2977a) {
            case 0:
                Runnable runnable = this.f2978b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2979c)));
                return;
            case 1:
                Runnable runnable2 = this.f2978b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2979c)));
                return;
            default:
                Runnable runnable3 = this.f2978b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2979c)));
                return;
        }
    }
}
