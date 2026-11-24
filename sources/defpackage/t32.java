package defpackage;
public final class t32 implements Runnable {
    public final byte a;
    public final v32 b;

    public t32(v32 v32Var, byte b) {
        this.a = b;
        this.b = v32Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v32 v32Var = this.b;
        switch (b) {
            case 0:
                if (v32Var.f != null) {
                    v32Var.w = mlb.l(new StringBuilder("+"), v32Var.f.phone, r58.f());
                    v32Var.s = v32Var.f;
                    gm.c3(new t32(v32Var, (byte) 1));
                    return;
                }
                return;
            default:
                v32Var.c.l(v32Var.w, false);
                return;
        }
    }
}
