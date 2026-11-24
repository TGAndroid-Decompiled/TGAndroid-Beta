package defpackage;
public final class m73 extends gw2 {
    public v73 a;
    public int b;
    public Object c;
    public final v73 d;
    public int e;

    public m73(v73 v73Var, gw2 gw2Var) {
        super(gw2Var);
        this.d = v73Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(this);
    }
}
