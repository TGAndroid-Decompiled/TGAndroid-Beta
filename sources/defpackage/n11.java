package defpackage;
public final class n11 implements yr3 {
    public final byte a;
    public final q11 b;
    public final vs2 c;

    public n11(vs2 vs2Var, q11 q11Var, byte b) {
        this.a = b;
        this.c = vs2Var;
        this.b = q11Var;
    }

    @Override
    public final void a(yla ylaVar, float f, float f2) {
        byte b = this.a;
        q11 q11Var = this.b;
        vs2 vs2Var = this.c;
        switch (b) {
            case 0:
                ((gw) vs2Var).accept(Float.valueOf(q11Var.getTranslationY()));
                return;
            default:
                ((i42) vs2Var).accept(Float.valueOf(q11Var.getTranslationY()));
                return;
        }
    }
}
