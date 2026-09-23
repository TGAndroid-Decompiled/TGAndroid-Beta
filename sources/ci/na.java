package ci;

import org.telegram.messenger.AndroidUtilities;
public final class na implements Runnable {
    public final int f5219a;
    public final lc f5220b;
    public final Runnable f5221c;

    public na(lc lcVar, Runnable runnable, int i10) {
        this.f5219a = i10;
        this.f5220b = lcVar;
        this.f5221c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5219a) {
            case 0:
                this.f5221c.run();
                this.f5220b.p0();
                return;
            default:
                lc lcVar = this.f5220b;
                lcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(lcVar.f5049g2);
                lcVar.f5049g2 = null;
                lcVar.S1 = false;
                this.f5221c.run();
                return;
        }
    }
}
