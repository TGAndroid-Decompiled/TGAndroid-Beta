package di;

import org.telegram.messenger.AndroidUtilities;
public final class ma implements Runnable {
    public final int f7435a;
    public final kc f7436b;
    public final Runnable f7437c;

    public ma(kc kcVar, Runnable runnable, int i10) {
        this.f7435a = i10;
        this.f7436b = kcVar;
        this.f7437c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f7435a) {
            case 0:
                this.f7437c.run();
                this.f7436b.o0();
                return;
            default:
                kc kcVar = this.f7436b;
                kcVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(kcVar.f7260g2);
                kcVar.f7260g2 = null;
                kcVar.S1 = false;
                this.f7437c.run();
                return;
        }
    }
}
