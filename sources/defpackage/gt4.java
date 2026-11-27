package defpackage;
public final class gt4 implements Runnable {
    public final byte a;
    public final ht4 b;

    public gt4(ht4 ht4Var, byte b) {
        this.a = b;
        this.b = ht4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ht4 ht4Var = this.b;
        switch (b) {
            case 0:
                if (ht4Var.d.K == ht4Var) {
                    ht4Var.d.a0 = false;
                    ht4Var.d.b0 = null;
                    ht4Var.d.h();
                    return;
                }
                return;
            default:
                if (ht4Var.d.K == ht4Var && !ht4Var.b) {
                    ht4Var.d.a0 = true;
                    Runnable runnable = ht4Var.d.b0;
                    ht4Var.d.b0 = null;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
