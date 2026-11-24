package defpackage;
public final class nc9 implements Runnable {
    public final byte a;
    public final hd9 b;

    public nc9(hd9 hd9Var, byte b) {
        this.a = b;
        this.b = hd9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hd9 hd9Var = this.b;
        switch (b) {
            case 0:
                hd9Var.F0();
                return;
            case 1:
                if (hd9Var.L0 != 0) {
                    hd9Var.b0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (hd9Var.L0 != 1) {
                    hd9Var.i0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                if (hd9Var.L0 != 2) {
                    hd9Var.w0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                hd9Var.m0();
                return;
            case 5:
                hd9Var.v0(2147483646, 0, true);
                j47 j47Var = hd9Var.P0;
                if (j47Var != null) {
                    j47Var.f(false);
                    hd9Var.P0 = null;
                    return;
                }
                return;
            default:
                hd9Var.v0(0, 0, false);
                j47 j47Var2 = hd9Var.P0;
                if (j47Var2 != null) {
                    j47Var2.f(true);
                    hd9Var.P0 = null;
                    return;
                }
                return;
        }
    }
}
