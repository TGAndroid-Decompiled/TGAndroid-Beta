package di;

import org.telegram.messenger.AndroidUtilities;
public final class k2 implements Runnable {
    public final int f8709a;
    public final Runnable f8710b;
    public final long f8711c;

    public k2(int i10, long j10, Runnable runnable) {
        this.f8709a = i10;
        this.f8710b = runnable;
        this.f8711c = j10;
    }

    @Override
    public final void run() {
        switch (this.f8709a) {
            case 0:
                Runnable runnable = this.f8710b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8711c)));
                return;
            case 1:
                Runnable runnable2 = this.f8710b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8711c)));
                return;
            default:
                Runnable runnable3 = this.f8710b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f8711c)));
                return;
        }
    }
}
