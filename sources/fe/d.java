package fe;
public final class d extends nd.c {
    public Object f10438a;
    public int f10439b;
    public final rf.b f10440c;
    public rf.b d;
    public c e;

    public d(rf.b bVar, nd.c cVar) {
        super(cVar);
        this.f10440c = bVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10438a = obj;
        this.f10439b |= Integer.MIN_VALUE;
        return this.f10440c.C(null, this);
    }
}
