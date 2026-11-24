package defpackage;
public final class j73 extends gw2 {
    public Object a;
    public v73 b;
    public cp2 c;
    public Object d;
    public final v73 e;
    public int f;

    public j73(v73 v73Var, gw2 gw2Var) {
        super(gw2Var);
        this.e = v73Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
