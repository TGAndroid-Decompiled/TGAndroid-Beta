package defpackage;
public final class h02 implements Runnable {
    public final byte a;
    public final n12 b;
    public final boolean c;

    public h02(n12 n12Var, boolean z, byte b) {
        this.a = b;
        this.b = n12Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        n12 n12Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    n12Var.Z2.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (!z) {
                    n12Var.v1.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (!z) {
                    n12Var.x1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (z) {
                    n12Var.u3.setVisibility(4);
                    return;
                } else {
                    n12Var.getClass();
                    return;
                }
        }
    }
}
