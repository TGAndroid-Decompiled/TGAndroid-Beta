package ci;

import org.telegram.messenger.AndroidUtilities;
public final class ma implements Runnable {
    public final int f5581a;
    public final kc f5582b;
    public final Runnable f5583c;

    public ma(kc kcVar, Runnable runnable, int i10) {
        this.f5581a = i10;
        this.f5582b = kcVar;
        this.f5583c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5581a) {
            case 0:
                this.f5583c.run();
                this.f5582b.p0();
                return;
            default:
                kc kcVar = this.f5582b;
                kcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(kcVar.f5398g2);
                kcVar.f5398g2 = null;
                kcVar.S1 = false;
                this.f5583c.run();
                return;
        }
    }
}
