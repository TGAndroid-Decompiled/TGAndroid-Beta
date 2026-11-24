package defpackage;
public final class v21 implements it3 {
    public final byte a;
    public final y21 b;
    public final gu2 c;

    public v21(gu2 gu2Var, y21 y21Var, byte b) {
        this.a = b;
        this.c = gu2Var;
        this.b = y21Var;
    }

    @Override
    public final void a(zna znaVar, float f, float f2) {
        byte b = this.a;
        y21 y21Var = this.b;
        gu2 gu2Var = this.c;
        switch (b) {
            case 0:
                ((gx) gu2Var).accept(Float.valueOf(y21Var.getTranslationY()));
                return;
            default:
                ((t52) gu2Var).accept(Float.valueOf(y21Var.getTranslationY()));
                return;
        }
    }
}
