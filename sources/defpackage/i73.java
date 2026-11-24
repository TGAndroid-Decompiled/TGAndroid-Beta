package defpackage;
public final class i73 extends gw2 {
    public v73 a;
    public nh7 b;
    public Object c;
    public final v73 d;
    public int e;

    public i73(v73 v73Var, gw2 gw2Var) {
        super(gw2Var);
        this.d = v73Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
