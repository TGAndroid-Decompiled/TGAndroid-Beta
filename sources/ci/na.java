package ci;

import org.telegram.messenger.AndroidUtilities;
public final class na implements Runnable {
    public final int f5648a;
    public final lc f5649b;
    public final Runnable f5650c;

    public na(lc lcVar, Runnable runnable, int i10) {
        this.f5648a = i10;
        this.f5649b = lcVar;
        this.f5650c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5648a) {
            case 0:
                this.f5650c.run();
                this.f5649b.o0();
                return;
            default:
                lc lcVar = this.f5649b;
                lcVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(lcVar.f5480g2);
                lcVar.f5480g2 = null;
                lcVar.S1 = false;
                this.f5650c.run();
                return;
        }
    }
}
