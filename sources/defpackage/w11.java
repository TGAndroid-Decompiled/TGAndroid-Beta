package defpackage;
public final class w11 implements qs3 {
    public final byte a;
    public final z11 b;
    public final pt2 c;

    public w11(pt2 pt2Var, z11 z11Var, byte b) {
        this.a = b;
        this.c = pt2Var;
        this.b = z11Var;
    }

    @Override
    public final void a(vpa vpaVar, float f, float f2) {
        byte b = this.a;
        z11 z11Var = this.b;
        pt2 pt2Var = this.c;
        switch (b) {
            case 0:
                ((hw) pt2Var).accept(Float.valueOf(z11Var.getTranslationY()));
                return;
            default:
                ((y42) pt2Var).accept(Float.valueOf(z11Var.getTranslationY()));
                return;
        }
    }
}
