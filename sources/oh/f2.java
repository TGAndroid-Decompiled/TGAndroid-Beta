package oh;

import org.telegram.messenger.AndroidUtilities;
public final class f2 implements Runnable {
    public final int f17048a;
    public final Runnable f17049b;
    public final long f17050c;

    public f2(int i10, long j10, Runnable runnable) {
        this.f17048a = i10;
        this.f17049b = runnable;
        this.f17050c = j10;
    }

    @Override
    public final void run() {
        switch (this.f17048a) {
            case 0:
                Runnable runnable = this.f17049b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f17050c)));
                return;
            case 1:
                Runnable runnable2 = this.f17049b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f17050c)));
                return;
            default:
                Runnable runnable3 = this.f17049b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f17050c)));
                return;
        }
    }
}
