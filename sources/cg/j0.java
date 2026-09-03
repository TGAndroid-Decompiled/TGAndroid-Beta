package cg;

import org.telegram.messenger.AndroidUtilities;
public final class j0 implements Runnable {
    public final int f2414a;
    public final m0 f2415b;
    public final e1 f2416c;

    public j0(m0 m0Var, e1 e1Var, int i10) {
        this.f2414a = i10;
        this.f2415b = m0Var;
        this.f2416c = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f2414a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(this.f2415b, this.f2416c, 1));
                return;
            default:
                m0 m0Var = this.f2415b;
                m0Var.getClass();
                m0Var.f2436i = this.f2416c.f2348a;
                return;
        }
    }
}
