package dg;

import org.telegram.messenger.AndroidUtilities;
public final class j0 implements Runnable {
    public final int f4564a;
    public final m0 f4565b;
    public final d1 f4566c;

    public j0(m0 m0Var, d1 d1Var, int i10) {
        this.f4564a = i10;
        this.f4565b = m0Var;
        this.f4566c = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f4564a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(this.f4565b, this.f4566c, 1));
                return;
            default:
                m0 m0Var = this.f4565b;
                m0Var.getClass();
                m0Var.f4588i = this.f4566c.f4483a;
                return;
        }
    }
}
