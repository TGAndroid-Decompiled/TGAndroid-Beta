package defpackage;
public final class f6a extends gw2 {
    public Object a;
    public final g6a b;
    public int c;

    public f6a(g6a g6aVar, gw2 gw2Var) {
        super(gw2Var);
        this.b = g6aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
