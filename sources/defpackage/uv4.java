package defpackage;
public final class uv4 implements it3 {
    public final byte a;
    public final xv4 b;

    public uv4(xv4 xv4Var, byte b) {
        this.a = b;
        this.b = xv4Var;
    }

    @Override
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        xv4 xv4Var = this.b;
        switch (b) {
            case 0:
                xv4Var.b(f / 1000.0f);
                return;
            default:
                xv4Var.b(Math.max(0.0f, f / 1000.0f));
                return;
        }
    }
}
