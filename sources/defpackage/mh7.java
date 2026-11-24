package defpackage;
public final class mh7 implements la1, akc {
    public final na1 a;
    public final nh7 b;

    public mh7(nh7 nh7Var, na1 na1Var) {
        this.b = nh7Var;
        this.a = na1Var;
    }

    @Override
    public final void a(nv9 nv9Var, int i) {
        this.a.a(nv9Var, i);
    }

    @Override
    public final lo5 b(Object obj, gq4 gq4Var) {
        nh7 nh7Var = this.b;
        ma1 ma1Var = new ma1(nh7Var, this);
        lo5 E = this.a.E((g5c) obj, ma1Var);
        if (E != null) {
            nh7.h.set(nh7Var, null);
        }
        return E;
    }

    @Override
    public final void e(Object obj) {
        this.a.e(obj);
    }

    @Override
    public final sw2 getContext() {
        return this.a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
