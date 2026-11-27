package defpackage;
public final class i64 implements b86, ot2 {
    public final byte a;
    public final float b;

    public i64(float f, byte b) {
        this.a = b;
        this.b = f;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        float f = this.b;
        og8 og8Var = (og8) obj;
        switch (b) {
            case 1:
                og8Var.d(f);
                return;
            default:
                og8Var.R(f);
                return;
        }
    }

    @Override
    public final void invoke(Object obj) {
        ((bg8) obj).q(this.b);
    }
}
