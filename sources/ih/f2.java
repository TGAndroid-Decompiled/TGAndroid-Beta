package ih;

import org.telegram.messenger.AndroidUtilities;
public final class f2 implements Runnable {
    public final int f11409a;
    public final Runnable f11410b;
    public final long f11411c;

    public f2(int i9, long j10, Runnable runnable) {
        this.f11409a = i9;
        this.f11410b = runnable;
        this.f11411c = j10;
    }

    @Override
    public final void run() {
        switch (this.f11409a) {
            case 0:
                Runnable runnable = this.f11410b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f11411c)));
                return;
            case 1:
                Runnable runnable2 = this.f11410b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f11411c)));
                return;
            default:
                Runnable runnable3 = this.f11410b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f11411c)));
                return;
        }
    }
}
