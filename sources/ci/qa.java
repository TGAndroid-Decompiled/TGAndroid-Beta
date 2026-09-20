package ci;

import org.telegram.messenger.AndroidUtilities;
public final class qa implements Runnable {
    public final int f5364a;
    public final oc f5365b;
    public final Runnable f5366c;

    public qa(oc ocVar, Runnable runnable, int i10) {
        this.f5364a = i10;
        this.f5365b = ocVar;
        this.f5366c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5364a) {
            case 0:
                this.f5366c.run();
                this.f5365b.p0();
                return;
            default:
                oc ocVar = this.f5365b;
                ocVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(ocVar.f5228g2);
                ocVar.f5228g2 = null;
                ocVar.S1 = false;
                this.f5366c.run();
                return;
        }
    }
}
