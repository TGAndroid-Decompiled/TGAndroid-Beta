package og;

import org.telegram.messenger.AndroidUtilities;
public final class e0 implements Runnable {
    public final int f14345a;
    public final g0 f14346b;
    public final w0 f14347c;

    public e0(g0 g0Var, w0 w0Var, int i10) {
        this.f14345a = i10;
        this.f14346b = g0Var;
        this.f14347c = w0Var;
    }

    @Override
    public final void run() {
        switch (this.f14345a) {
            case 0:
                AndroidUtilities.runOnUIThread(new e0(this.f14346b, this.f14347c, 1));
                return;
            default:
                g0 g0Var = this.f14346b;
                g0Var.getClass();
                g0Var.f14369i = this.f14347c.f14538a;
                return;
        }
    }
}
