package defpackage;
public final class dt4 implements Runnable {
    public final byte a;
    public final et4 b;

    public dt4(et4 et4Var, byte b) {
        this.a = b;
        this.b = et4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        et4 et4Var = this.b;
        switch (b) {
            case 0:
                if (et4Var.d.K == et4Var) {
                    et4Var.d.a0 = false;
                    et4Var.d.b0 = null;
                    et4Var.d.h();
                    return;
                }
                return;
            default:
                if (et4Var.d.K == et4Var && !et4Var.b) {
                    et4Var.d.a0 = true;
                    Runnable runnable = et4Var.d.b0;
                    et4Var.d.b0 = null;
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
