package ci;

import org.telegram.messenger.AndroidUtilities;
public final class qa implements Runnable {
    public final int f5358a;
    public final oc f5359b;
    public final Runnable f5360c;

    public qa(oc ocVar, Runnable runnable, int i10) {
        this.f5358a = i10;
        this.f5359b = ocVar;
        this.f5360c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f5358a) {
            case 0:
                this.f5360c.run();
                this.f5359b.p0();
                return;
            default:
                oc ocVar = this.f5359b;
                ocVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(ocVar.f5222g2);
                ocVar.f5222g2 = null;
                ocVar.S1 = false;
                this.f5360c.run();
                return;
        }
    }
}
