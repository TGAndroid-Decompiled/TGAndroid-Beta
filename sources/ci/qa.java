package ci;

import org.telegram.messenger.AndroidUtilities;
public final class qa implements Runnable {
    public final int f5363a;
    public final oc f5364b;
    public final Runnable f5365c;

    public qa(oc ocVar, Runnable runnable, int i10) {
        this.f5363a = i10;
        this.f5364b = ocVar;
        this.f5365c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5363a) {
            case 0:
                this.f5365c.run();
                this.f5364b.p0();
                return;
            default:
                oc ocVar = this.f5364b;
                ocVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(ocVar.f5227g2);
                ocVar.f5227g2 = null;
                ocVar.S1 = false;
                this.f5365c.run();
                return;
        }
    }
}
