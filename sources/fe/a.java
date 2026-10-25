package fe;
public final class a extends nd.c {
    public ge.g f10436a;
    public Object f10437b;
    public final a4.l f10438c;
    public int d;

    public a(a4.l lVar, nd.c cVar) {
        super(cVar);
        this.f10438c = lVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10437b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10438c.C(null, this);
    }
}
