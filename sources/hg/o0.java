package hg;

import org.telegram.messenger.AndroidUtilities;
public final class o0 implements Runnable {
    public final int f7578a;
    public final t0 f7579b;

    public o0(t0 t0Var, int i10) {
        this.f7578a = i10;
        this.f7579b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f7578a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(this.f7579b, 1));
                return;
            default:
                this.f7579b.run(null);
                return;
        }
    }
}
