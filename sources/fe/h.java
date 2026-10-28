package fe;
public final class h extends nd.c {
    public i f10449a;
    public Object f10450b;
    public Object f10451c;
    public final i d;
    public int e;

    public h(i iVar, nd.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10451c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
