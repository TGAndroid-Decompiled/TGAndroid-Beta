package defpackage;
public final class bc0 extends c6 {
    public final byte a;
    public final mc0 b;

    public bc0(mc0 mc0Var, byte b) {
        this.a = b;
        this.b = mc0Var;
    }

    @Override
    public final void b(int i) {
        byte b = this.a;
        mc0 mc0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    mc0Var.i0();
                    return;
                }
                return;
            default:
                if (i == -1) {
                    mc0Var.i0();
                }
                if (i == 1) {
                    mc0Var.k0();
                    return;
                }
                return;
        }
    }
}
