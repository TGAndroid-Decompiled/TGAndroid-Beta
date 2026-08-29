package nh;

import org.telegram.messenger.AndroidUtilities;
public final class m9 implements Runnable {
    public final int f18150a;
    public final gb f18151b;
    public final Runnable f18152c;

    public m9(gb gbVar, Runnable runnable, int i10) {
        this.f18150a = i10;
        this.f18151b = gbVar;
        this.f18152c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f18150a) {
            case 0:
                this.f18152c.run();
                this.f18151b.p0();
                return;
            default:
                gb gbVar = this.f18151b;
                gbVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(gbVar.f17746c2);
                gbVar.f17746c2 = null;
                gbVar.O1 = false;
                this.f18152c.run();
                return;
        }
    }
}
