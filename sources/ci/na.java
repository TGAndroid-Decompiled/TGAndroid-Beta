package ci;

import org.telegram.messenger.AndroidUtilities;
public final class na implements Runnable {
    public final int f5649a;
    public final lc f5650b;
    public final Runnable f5651c;

    public na(lc lcVar, Runnable runnable, int i10) {
        this.f5649a = i10;
        this.f5650b = lcVar;
        this.f5651c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5649a) {
            case 0:
                this.f5651c.run();
                this.f5650b.o0();
                return;
            default:
                lc lcVar = this.f5650b;
                lcVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(lcVar.f5481g2);
                lcVar.f5481g2 = null;
                lcVar.S1 = false;
                this.f5651c.run();
                return;
        }
    }
}
