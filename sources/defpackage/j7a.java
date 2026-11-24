package defpackage;
public final class j7a extends gw2 {
    public Object a;
    public final k7a b;
    public int c;

    public j7a(k7a k7aVar, gw2 gw2Var) {
        super(gw2Var);
        this.b = k7aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
