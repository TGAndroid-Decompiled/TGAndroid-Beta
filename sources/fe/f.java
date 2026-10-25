package fe;
public final class f extends nd.c {
    public g f10445a;
    public Object f10446b;
    public final g f10447c;
    public int d;

    public f(g gVar, nd.c cVar) {
        super(cVar);
        this.f10447c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10446b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10447c.b(null, this);
    }
}
