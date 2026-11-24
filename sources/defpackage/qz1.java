package defpackage;
public final class qz1 implements Runnable {
    public final byte a;
    public final x02 b;
    public final boolean c;

    public qz1(x02 x02Var, boolean z, byte b) {
        this.a = b;
        this.b = x02Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    x02Var.Z2.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (!z) {
                    x02Var.v1.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (!z) {
                    x02Var.x1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (z) {
                    x02Var.u3.setVisibility(4);
                    return;
                } else {
                    x02Var.getClass();
                    return;
                }
        }
    }
}
