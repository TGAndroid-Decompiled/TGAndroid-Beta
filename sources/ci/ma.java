package ci;

import org.telegram.messenger.AndroidUtilities;
public final class ma implements Runnable {
    public final int f5182a;
    public final kc f5183b;
    public final Runnable f5184c;

    public ma(kc kcVar, Runnable runnable, int i10) {
        this.f5182a = i10;
        this.f5183b = kcVar;
        this.f5184c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5182a) {
            case 0:
                this.f5184c.run();
                this.f5183b.p0();
                return;
            default:
                kc kcVar = this.f5183b;
                kcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(kcVar.f5005g2);
                kcVar.f5005g2 = null;
                kcVar.S1 = false;
                this.f5184c.run();
                return;
        }
    }
}
