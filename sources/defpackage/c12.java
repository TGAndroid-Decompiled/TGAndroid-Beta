package defpackage;
public final class c12 implements Runnable {
    public final byte a;
    public final i22 b;
    public final boolean c;

    public c12(i22 i22Var, boolean z, byte b) {
        this.a = b;
        this.b = i22Var;
        this.c = z;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    i22Var.Z2.setVisibility(8);
                    return;
                }
                return;
            case 1:
                if (!z) {
                    i22Var.v1.setVisibility(8);
                    return;
                }
                return;
            case 2:
                if (!z) {
                    i22Var.x1.setVisibility(8);
                    return;
                }
                return;
            default:
                if (z) {
                    i22Var.u3.setVisibility(4);
                    return;
                } else {
                    i22Var.getClass();
                    return;
                }
        }
    }
}
