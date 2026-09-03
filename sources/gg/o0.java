package gg;

import org.telegram.messenger.AndroidUtilities;
public final class o0 implements Runnable {
    public final int f6713a;
    public final t0 f6714b;

    public o0(t0 t0Var, int i10) {
        this.f6713a = i10;
        this.f6714b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f6713a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(this.f6714b, 1));
                return;
            default:
                this.f6714b.run(null);
                return;
        }
    }
}
