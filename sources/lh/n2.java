package lh;

import org.telegram.messenger.AndroidUtilities;

public final class n2 implements Runnable {

    public final int f16421a;

    public final r2 f16422b;

    public final n6 f16423c;

    public n2(r2 r2Var, n6 n6Var, int i10) {
        this.f16421a = i10;
        this.f16422b = r2Var;
        this.f16423c = n6Var;
    }

    @Override
    public final void run() {
        switch (this.f16421a) {
            case 0:
                r2 r2Var = this.f16422b;
                r2Var.getClass();
                AndroidUtilities.runOnUIThread(new n2(r2Var, this.f16423c, 1), 320L);
                break;
            default:
                r2 r2Var2 = this.f16422b;
                r2Var2.getClass();
                this.f16423c.run(new ag.n0(r2Var2, 27));
                break;
        }
    }
}
