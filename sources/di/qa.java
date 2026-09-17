package di;

import org.telegram.messenger.AndroidUtilities;
public final class qa implements Runnable {
    public final int f8046a;
    public final pc f8047b;
    public final Runnable f8048c;

    public qa(pc pcVar, Runnable runnable, int i10) {
        this.f8046a = i10;
        this.f8047b = pcVar;
        this.f8048c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f8046a) {
            case 0:
                this.f8048c.run();
                this.f8047b.p0();
                return;
            default:
                pc pcVar = this.f8047b;
                pcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(pcVar.f7893g2);
                pcVar.f7893g2 = null;
                pcVar.S1 = false;
                this.f8048c.run();
                return;
        }
    }
}
