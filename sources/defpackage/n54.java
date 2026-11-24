package defpackage;
public final class n54 implements x56, us2 {
    public final byte a;
    public final float b;

    public n54(float f, byte b) {
        this.a = b;
        this.b = f;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        float f = this.b;
        ad8 ad8Var = (ad8) obj;
        switch (b) {
            case 1:
                ad8Var.c(f);
                return;
            default:
                ad8Var.R(f);
                return;
        }
    }

    @Override
    public final void invoke(Object obj) {
        ((mc8) obj).q(this.b);
    }
}
