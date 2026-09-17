package bi;

import org.telegram.messenger.AndroidUtilities;
public final class b3 implements Runnable {
    public final int f2790a;
    public final Runnable f2791b;
    public final long f2792c;

    public b3(int i10, long j3, Runnable runnable) {
        this.f2790a = i10;
        this.f2791b = runnable;
        this.f2792c = j3;
    }

    @Override
    public final void run() {
        switch (this.f2790a) {
            case 0:
                Runnable runnable = this.f2791b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2792c)));
                return;
            case 1:
                Runnable runnable2 = this.f2791b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2792c)));
                return;
            default:
                Runnable runnable3 = this.f2791b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2792c)));
                return;
        }
    }
}
