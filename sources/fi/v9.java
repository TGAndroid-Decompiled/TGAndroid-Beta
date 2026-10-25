package fi;

import org.telegram.messenger.AndroidUtilities;
public final class v9 implements Runnable {
    public final int f11827a;
    public final sb f11828b;
    public final Runnable f11829c;

    public v9(sb sbVar, Runnable runnable, int i10) {
        this.f11827a = i10;
        this.f11828b = sbVar;
        this.f11829c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f11827a) {
            case 0:
                this.f11829c.run();
                this.f11828b.o0();
                return;
            default:
                sb sbVar = this.f11828b;
                sbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(sbVar.f11628g2);
                sbVar.f11628g2 = null;
                sbVar.S1 = false;
                this.f11829c.run();
                return;
        }
    }
}
