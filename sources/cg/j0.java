package cg;

import org.telegram.messenger.AndroidUtilities;
public final class j0 implements Runnable {
    public final int f2431a;
    public final m0 f2432b;
    public final e1 f2433c;

    public j0(m0 m0Var, e1 e1Var, int i10) {
        this.f2431a = i10;
        this.f2432b = m0Var;
        this.f2433c = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f2431a) {
            case 0:
                AndroidUtilities.runOnUIThread(new j0(this.f2432b, this.f2433c, 1));
                return;
            default:
                m0 m0Var = this.f2432b;
                m0Var.getClass();
                m0Var.f2453i = this.f2433c.f2365a;
                return;
        }
    }
}
