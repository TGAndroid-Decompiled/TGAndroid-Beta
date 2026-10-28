package fi;

import org.telegram.messenger.AndroidUtilities;
public final class v9 implements Runnable {
    public final int f11826a;
    public final sb f11827b;
    public final Runnable f11828c;

    public v9(sb sbVar, Runnable runnable, int i10) {
        this.f11826a = i10;
        this.f11827b = sbVar;
        this.f11828c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f11826a) {
            case 0:
                this.f11828c.run();
                this.f11827b.o0();
                return;
            default:
                sb sbVar = this.f11827b;
                sbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(sbVar.f11627g2);
                sbVar.f11627g2 = null;
                sbVar.S1 = false;
                this.f11828c.run();
                return;
        }
    }
}
