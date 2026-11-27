package defpackage;
public final class gg9 implements Runnable {
    public final byte a;
    public final yg9 b;

    public gg9(yg9 yg9Var, byte b) {
        this.a = b;
        this.b = yg9Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        yg9 yg9Var = this.b;
        switch (b) {
            case 0:
                yg9Var.G0();
                return;
            case 1:
                if (yg9Var.L0 != 0) {
                    yg9Var.b0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (yg9Var.L0 != 1) {
                    yg9Var.i0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                if (yg9Var.L0 != 2) {
                    yg9Var.w0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                yg9Var.m0();
                return;
            case 5:
                yg9Var.w0(2147483646, 0, true);
                q67 q67Var = yg9Var.P0;
                if (q67Var != null) {
                    q67Var.f(false);
                    yg9Var.P0 = null;
                    return;
                }
                return;
            default:
                yg9Var.w0(0, 0, false);
                q67 q67Var2 = yg9Var.P0;
                if (q67Var2 != null) {
                    q67Var2.f(true);
                    yg9Var.P0 = null;
                    return;
                }
                return;
        }
    }
}
