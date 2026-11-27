package defpackage;
public final class tb1 implements Runnable {
    public final byte a;
    public final ub1 b;
    public final boolean c;

    public tb1(ub1 ub1Var, boolean z, byte b) {
        this.a = b;
        this.b = ub1Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        ub1 ub1Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    ub1Var.V0.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!z) {
                    ub1Var.Z0.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
