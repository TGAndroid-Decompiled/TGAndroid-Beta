package fe;
public final class d extends nd.c {
    public Object f10439a;
    public int f10440b;
    public final rf.b f10441c;
    public rf.b d;
    public c e;

    public d(rf.b bVar, nd.c cVar) {
        super(cVar);
        this.f10441c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10439a = obj;
        this.f10440b |= Integer.MIN_VALUE;
        return this.f10441c.C(null, this);
    }
}
