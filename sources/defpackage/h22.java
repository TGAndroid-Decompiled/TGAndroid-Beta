package defpackage;
public final class h22 implements Runnable {
    public final byte a;
    public final j22 b;

    public h22(j22 j22Var, byte b) {
        this.a = b;
        this.b = j22Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        j22 j22Var = this.b;
        switch (b) {
            case 0:
                if (j22Var.f != null) {
                    j22Var.w = yjb.k(new StringBuilder("+"), j22Var.f.phone, p38.f());
                    j22Var.s = j22Var.f;
                    gl.d3(new h22(j22Var, (byte) 1));
                    return;
                }
                return;
            default:
                j22Var.c.l(j22Var.w, false);
                return;
        }
    }
}
