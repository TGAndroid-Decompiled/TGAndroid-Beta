package bi;

import org.telegram.messenger.AndroidUtilities;
public final class zb implements Runnable {
    public final int f4021a;
    public final ce f4022b;
    public final Runnable f4023c;

    public zb(ce ceVar, Runnable runnable, int i10) {
        this.f4021a = i10;
        this.f4022b = ceVar;
        this.f4023c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f4021a) {
            case 0:
                this.f4023c.run();
                this.f4022b.p0();
                return;
            default:
                ce ceVar = this.f4022b;
                ceVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(ceVar.f2453g2);
                ceVar.f2453g2 = null;
                ceVar.S1 = false;
                this.f4023c.run();
                return;
        }
    }
}
