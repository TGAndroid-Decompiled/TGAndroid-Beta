package oh;

import org.telegram.messenger.AndroidUtilities;
public final class f2 implements Runnable {
    public final int f17050a;
    public final Runnable f17051b;
    public final long f17052c;

    public f2(int i10, long j10, Runnable runnable) {
        this.f17050a = i10;
        this.f17051b = runnable;
        this.f17052c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17050a) {
            case 0:
                Runnable runnable = this.f17051b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f17052c)));
                return;
            case 1:
                Runnable runnable2 = this.f17051b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f17052c)));
                return;
            default:
                Runnable runnable3 = this.f17051b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f17052c)));
                return;
        }
    }
}
