package di;

import org.telegram.messenger.AndroidUtilities;
public final class ma implements Runnable {
    public final int f7432a;
    public final kc f7433b;
    public final Runnable f7434c;

    public ma(kc kcVar, Runnable runnable, int i10) {
        this.f7432a = i10;
        this.f7433b = kcVar;
        this.f7434c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f7432a) {
            case 0:
                this.f7434c.run();
                this.f7433b.o0();
                return;
            default:
                kc kcVar = this.f7433b;
                kcVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(kcVar.f7257g2);
                kcVar.f7257g2 = null;
                kcVar.S1 = false;
                this.f7434c.run();
                return;
        }
    }
}
