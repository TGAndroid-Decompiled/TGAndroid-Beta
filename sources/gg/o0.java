package gg;

import org.telegram.messenger.AndroidUtilities;
public final class o0 implements Runnable {
    public final int f6726a;
    public final t0 f6727b;

    public o0(t0 t0Var, int i10) {
        this.f6726a = i10;
        this.f6727b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f6726a) {
            case 0:
                AndroidUtilities.runOnUIThread(new o0(this.f6727b, 1));
                return;
            default:
                this.f6727b.run(null);
                return;
        }
    }
}
