package defpackage;
public final class hw0 extends d6 {
    public final byte a;
    public final xw0 b;

    public hw0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override
    public final void b(int i) {
        byte b = this.a;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                if (i == -1) {
                    if (!xw0Var.E.A()) {
                        xw0Var.v();
                        return;
                    }
                    return;
                } else if (i == 2131296494) {
                    xw0Var.z0 = true;
                    xw0Var.m(true);
                    return;
                } else {
                    return;
                }
            default:
                if (i == -1) {
                    xw0Var.v();
                    return;
                }
                return;
        }
    }
}
