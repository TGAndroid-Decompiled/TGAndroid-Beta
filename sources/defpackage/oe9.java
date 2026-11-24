package defpackage;
public final class oe9 implements Runnable {
    public final byte a;
    public final jf9 b;

    public oe9(jf9 jf9Var, byte b) {
        this.a = b;
        this.b = jf9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jf9 jf9Var = this.b;
        switch (b) {
            case 0:
                jf9Var.G0();
                return;
            case 1:
                if (jf9Var.L0 != 0) {
                    jf9Var.b0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (jf9Var.L0 != 1) {
                    jf9Var.i0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                if (jf9Var.L0 != 2) {
                    jf9Var.w0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                jf9Var.n0();
                return;
            case 5:
                jf9Var.w0(2147483646, 0, true);
                j67 j67Var = jf9Var.P0;
                if (j67Var != null) {
                    j67Var.f(false);
                    jf9Var.P0 = null;
                    return;
                }
                return;
            default:
                jf9Var.w0(0, 0, false);
                j67 j67Var2 = jf9Var.P0;
                if (j67Var2 != null) {
                    j67Var2.f(true);
                    jf9Var.P0 = null;
                    return;
                }
                return;
        }
    }
}
