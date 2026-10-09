package ci;

import org.telegram.messenger.AndroidUtilities;
public final class na implements Runnable {
    public final int f5650a;
    public final lc f5651b;
    public final Runnable f5652c;

    public na(lc lcVar, Runnable runnable, int i10) {
        this.f5650a = i10;
        this.f5651b = lcVar;
        this.f5652c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5650a) {
            case 0:
                this.f5652c.run();
                this.f5651b.o0();
                return;
            default:
                lc lcVar = this.f5651b;
                lcVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(lcVar.f5482g2);
                lcVar.f5482g2 = null;
                lcVar.S1 = false;
                this.f5652c.run();
                return;
        }
    }
}
