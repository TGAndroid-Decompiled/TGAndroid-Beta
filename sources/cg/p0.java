package cg;

import org.telegram.messenger.AndroidUtilities;

public final class p0 implements Runnable {

    public final int f2798a;

    public final v0 f2799b;

    public p0(v0 v0Var, int i10) {
        this.f2798a = i10;
        this.f2799b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f2798a) {
            case 0:
                AndroidUtilities.runOnUIThread(new p0(this.f2799b, 1));
                break;
            default:
                this.f2799b.run(null);
                break;
        }
    }
}
