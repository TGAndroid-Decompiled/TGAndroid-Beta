package defpackage;
public final class g8a extends gw2 {
    public Object a;
    public final h8a b;
    public int c;

    public g8a(h8a h8aVar, gw2 gw2Var) {
        super(gw2Var);
        this.b = h8aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
