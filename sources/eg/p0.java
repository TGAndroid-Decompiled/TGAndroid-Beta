package eg;

import org.telegram.messenger.AndroidUtilities;
public final class p0 implements Runnable {
    public final int f6109a;
    public final u0 f6110b;

    public p0(u0 u0Var, int i10) {
        this.f6109a = i10;
        this.f6110b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f6109a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f6110b, 1));
                return;
            default:
                this.f6110b.run(null);
                return;
        }
    }
}
