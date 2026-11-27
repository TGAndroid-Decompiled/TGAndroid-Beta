package defpackage;
public final class y22 implements Runnable {
    public final byte a;
    public final a32 b;

    public y22(a32 a32Var, byte b) {
        this.a = b;
        this.b = a32Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        a32 a32Var = this.b;
        switch (b) {
            case 0:
                if (a32Var.f != null) {
                    a32Var.w = xnb.k(new StringBuilder("+"), a32Var.f.phone, f78.f());
                    a32Var.s = a32Var.f;
                    hl.c3(new y22(a32Var, (byte) 1));
                    return;
                }
                return;
            default:
                a32Var.c.l(a32Var.w, false);
                return;
        }
    }
}
