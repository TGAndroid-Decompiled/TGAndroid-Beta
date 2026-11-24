package defpackage;
public final class x63 extends gw2 {
    public Object a;
    public Object b;
    public Object c;
    public c59 d;
    public v73 e;
    public Object f;
    public final y63 h;
    public int n;

    public x63(y63 y63Var, gw2 gw2Var) {
        super(gw2Var);
        this.h = y63Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
