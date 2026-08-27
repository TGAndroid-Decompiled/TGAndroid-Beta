package jh;

import org.telegram.messenger.AndroidUtilities;

public final class e2 implements Runnable {

    public final int f13215a;

    public final Runnable f13216b;

    public final long f13217c;

    public e2(int i10, long j10, Runnable runnable) {
        this.f13215a = i10;
        this.f13216b = runnable;
        this.f13217c = j10;
    }

    @Override
    public final void run() {
        switch (this.f13215a) {
            case 0:
                Runnable runnable = this.f13216b;
                AndroidUtilities.cancelRunOnUIThread(runnable);
                AndroidUtilities.runOnUIThread(runnable, Math.max(0L, 32 - (System.currentTimeMillis() - this.f13217c)));
                break;
            case 1:
                Runnable runnable2 = this.f13216b;
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                AndroidUtilities.runOnUIThread(runnable2, Math.max(0L, 32 - (System.currentTimeMillis() - this.f13217c)));
                break;
            default:
                Runnable runnable3 = this.f13216b;
                AndroidUtilities.cancelRunOnUIThread(runnable3);
                AndroidUtilities.runOnUIThread(runnable3, Math.max(0L, 32 - (System.currentTimeMillis() - this.f13217c)));
                break;
        }
    }
}
