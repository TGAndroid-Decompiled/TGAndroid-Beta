package defpackage;
public final class pc implements x76, fu2 {
    public final byte a;
    public final float b;

    public pc(float f, byte b) {
        this.a = b;
        this.b = f;
    }

    @Override
    public final void accept(Object obj) {
        byte b = this.a;
        float f = this.b;
        cf8 cf8Var = (cf8) obj;
        switch (b) {
            case 3:
                cf8Var.d(f);
                return;
            default:
                cf8Var.R(f);
                return;
        }
    }

    @Override
    public final void invoke(Object obj) {
        ((pe8) obj).q(this.b);
    }
}
