package defpackage;
public final class pz7 implements zw2 {
    public final pn1 a;

    public pz7(pn1 pn1Var) {
        this.a = pn1Var;
    }

    @Override
    public final mx2 getContext() {
        return u24.a;
    }

    @Override
    public final void resumeWith(Object obj) {
        boolean z = obj instanceof ge9;
        pn1 pn1Var = this.a;
        if (z) {
            pn1Var.a(null, ((ge9) obj).a);
        } else {
            pn1Var.a(obj, null);
        }
    }
}
