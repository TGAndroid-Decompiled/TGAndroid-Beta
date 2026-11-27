package defpackage;
public final class qx4 implements Runnable {
    public final byte a;
    public final sx4 b;
    public final boolean c;

    public qx4(sx4 sx4Var, boolean z, byte b) {
        this.a = b;
        this.b = sx4Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        sx4 sx4Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    sx4Var.H.setVisibility(8);
                    return;
                }
                return;
            default:
                if (!z) {
                    sx4Var.w.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
