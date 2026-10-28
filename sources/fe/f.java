package fe;
public final class f extends nd.c {
    public g f10444a;
    public Object f10445b;
    public final g f10446c;
    public int d;

    public f(g gVar, nd.c cVar) {
        super(cVar);
        this.f10446c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10445b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10446c.b(null, this);
    }
}
