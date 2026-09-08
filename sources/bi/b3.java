package bi;

import org.telegram.messenger.AndroidUtilities;
public final class b3 implements Runnable {
    public final int f2817a;
    public final Runnable f2818b;
    public final long f2819c;

    public b3(int i10, long j3, Runnable runnable) {
        this.f2817a = i10;
        this.f2818b = runnable;
        this.f2819c = j3;
    }

    @Override
    public final void run() {
        switch (this.f2817a) {
            case 0:
                Runnable runnable = this.f2818b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2819c)));
                return;
            case 1:
                Runnable runnable2 = this.f2818b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2819c)));
                return;
            default:
                Runnable runnable3 = this.f2818b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f2819c)));
                return;
        }
    }
}
