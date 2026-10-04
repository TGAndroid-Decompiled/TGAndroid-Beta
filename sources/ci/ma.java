package ci;

import org.telegram.messenger.AndroidUtilities;
public final class ma implements Runnable {
    public final int f5580a;
    public final kc f5581b;
    public final Runnable f5582c;

    public ma(kc kcVar, Runnable runnable, int i10) {
        this.f5580a = i10;
        this.f5581b = kcVar;
        this.f5582c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5580a) {
            case 0:
                this.f5582c.run();
                this.f5581b.p0();
                return;
            default:
                kc kcVar = this.f5581b;
                kcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(kcVar.f5397g2);
                kcVar.f5397g2 = null;
                kcVar.S1 = false;
                this.f5582c.run();
                return;
        }
    }
}
