package defpackage;
public final class st4 implements yr3 {
    public final byte a;
    public final vt4 b;

    public st4(vt4 vt4Var, byte b) {
        this.a = b;
        this.b = vt4Var;
    }

    @Override
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        vt4 vt4Var = this.b;
        switch (b) {
            case 0:
                vt4Var.b(f / 1000.0f);
                return;
            default:
                vt4Var.b(Math.max(0.0f, f / 1000.0f));
                return;
        }
    }
}
