package ag;

import org.telegram.messenger.AndroidUtilities;
public final class k0 implements Runnable {
    public final int f560a;
    public final n0 f561b;
    public final g1 f562c;

    public k0(n0 n0Var, g1 g1Var, int i10) {
        this.f560a = i10;
        this.f561b = n0Var;
        this.f562c = g1Var;
    }

    @Override
    public final void run() {
        switch (this.f560a) {
            case 0:
                AndroidUtilities.runOnUIThread(new k0(this.f561b, this.f562c, 1));
                return;
            default:
                n0 n0Var = this.f561b;
                n0Var.getClass();
                n0Var.f598i = this.f562c.f500a;
                return;
        }
    }
}
