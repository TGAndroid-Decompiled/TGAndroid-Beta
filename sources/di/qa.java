package di;

import org.telegram.messenger.AndroidUtilities;
public final class qa implements Runnable {
    public final int f8018a;
    public final pc f8019b;
    public final Runnable f8020c;

    public qa(pc pcVar, Runnable runnable, int i10) {
        this.f8018a = i10;
        this.f8019b = pcVar;
        this.f8020c = runnable;
    }

    @Override
    public final void run() {
        switch (this.f8018a) {
            case 0:
                this.f8020c.run();
                this.f8019b.p0();
                return;
            default:
                pc pcVar = this.f8019b;
                pcVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(pcVar.f7865g2);
                pcVar.f7865g2 = null;
                pcVar.S1 = false;
                this.f8020c.run();
                return;
        }
    }
}
