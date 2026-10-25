package fe;
public final class h extends nd.c {
    public i f10450a;
    public Object f10451b;
    public Object f10452c;
    public final i d;
    public int e;

    public h(i iVar, nd.c cVar) {
        super(cVar);
        this.d = iVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10452c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
