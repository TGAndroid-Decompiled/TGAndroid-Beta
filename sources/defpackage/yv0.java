package defpackage;
public final class yv0 extends c6 {
    public final byte a;
    public final ow0 b;

    public yv0(ow0 ow0Var, byte b) {
        this.a = b;
        this.b = ow0Var;
    }

    @Override
    public final void b(int i) {
        byte b = this.a;
        ow0 ow0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    if (!ow0Var.E.A()) {
                        ow0Var.v();
                        return;
                    }
                    return;
                } else if (i == 2131296494) {
                    ow0Var.z0 = true;
                    ow0Var.m(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i == -1) {
                    ow0Var.v();
                    return;
                }
                return;
        }
    }
}
