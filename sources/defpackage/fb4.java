package defpackage;
public final class fb4 extends gw2 {
    public hb4 a;
    public oa4 b;
    public boolean c;
    public Object d;
    public final hb4 e;
    public int f;

    public fb4(hb4 hb4Var, gw2 gw2Var) {
        super(gw2Var);
        this.e = hb4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
