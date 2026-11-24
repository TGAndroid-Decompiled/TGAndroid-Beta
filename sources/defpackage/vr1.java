package defpackage;
public final class vr1 implements Runnable {
    public final byte a;
    public final wr1 b;

    public vr1(wr1 wr1Var, byte b) {
        this.a = b;
        this.b = wr1Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        wr1 wr1Var = this.b;
        switch (b) {
            case 0:
                ar1 ar1Var = wr1Var.I.a0;
                if (ar1Var != null) {
                    ar1Var.h1();
                    return;
                }
                return;
            default:
                ar1 ar1Var2 = wr1Var.I.a0;
                if (ar1Var2 != null) {
                    ar1Var2.U0 = false;
                    wx1 wx1Var = ar1Var2.V0;
                    if (wx1Var != null) {
                        wx1Var.t(false);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
