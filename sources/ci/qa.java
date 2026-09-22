package ci;

import org.telegram.messenger.AndroidUtilities;
public final class qa implements Runnable {
    public final int f5360a;
    public final oc f5361b;
    public final Runnable f5362c;

    public qa(oc ocVar, Runnable runnable, int i10) {
        this.f5360a = i10;
        this.f5361b = ocVar;
        this.f5362c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5360a) {
            case 0:
                this.f5362c.run();
                this.f5361b.p0();
                return;
            default:
                oc ocVar = this.f5361b;
                ocVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(ocVar.f5224g2);
                ocVar.f5224g2 = null;
                ocVar.S1 = false;
                this.f5362c.run();
                return;
        }
    }
}
