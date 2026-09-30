package ci;

import org.telegram.messenger.AndroidUtilities;
public final class na implements Runnable {
    public final int f5226a;
    public final lc f5227b;
    public final Runnable f5228c;

    public na(lc lcVar, Runnable runnable, int i10) {
        this.f5226a = i10;
        this.f5227b = lcVar;
        this.f5228c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5226a) {
            case 0:
                this.f5228c.run();
                this.f5227b.p0();
                return;
            default:
                lc lcVar = this.f5227b;
                lcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(lcVar.f5056g2);
                lcVar.f5056g2 = null;
                lcVar.S1 = false;
                this.f5228c.run();
                return;
        }
    }
}
