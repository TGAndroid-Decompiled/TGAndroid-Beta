package ci;

import org.telegram.messenger.AndroidUtilities;
public final class qa implements Runnable {
    public final int f5362a;
    public final oc f5363b;
    public final Runnable f5364c;

    public qa(oc ocVar, Runnable runnable, int i10) {
        this.f5362a = i10;
        this.f5363b = ocVar;
        this.f5364c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5362a) {
            case 0:
                this.f5364c.run();
                this.f5363b.p0();
                return;
            default:
                oc ocVar = this.f5363b;
                ocVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(ocVar.f5226g2);
                ocVar.f5226g2 = null;
                ocVar.S1 = false;
                this.f5364c.run();
                return;
        }
    }
}
