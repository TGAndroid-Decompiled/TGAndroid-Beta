package defpackage;
public final class wv4 implements qs3 {
    public final byte a;
    public final zv4 b;

    public wv4(zv4 zv4Var, byte b) {
        this.a = b;
        this.b = zv4Var;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        zv4 zv4Var = this.b;
        switch (b) {
            case 0:
                zv4Var.b(f / 1000.0f);
                return;
            default:
                zv4Var.b(Math.max(0.0f, f / 1000.0f));
                return;
        }
    }
}
