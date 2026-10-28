package fe;
public final class a extends nd.c {
    public ge.g f10435a;
    public Object f10436b;
    public final a4.l f10437c;
    public int d;

    public a(a4.l lVar, nd.c cVar) {
        super(cVar);
        this.f10437c = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10436b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10437c.C(null, this);
    }
}
