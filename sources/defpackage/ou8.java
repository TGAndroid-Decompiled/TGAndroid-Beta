package defpackage;
public final class ou8 implements Runnable {
    public final byte a;
    public final uu8 b;

    public ou8(uu8 uu8Var, byte b) {
        this.a = b;
        this.b = uu8Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uu8 uu8Var = this.b;
        switch (b) {
            case 0:
                uu8Var.e0 = true;
                return;
            case 1:
                uu8Var.u();
                return;
            default:
                if (!uu8Var.k0) {
                    st6 st6Var = uu8Var.J;
                    st6Var.getClass();
                    st6Var.b(uu8Var);
                    return;
                }
                return;
        }
    }
}
