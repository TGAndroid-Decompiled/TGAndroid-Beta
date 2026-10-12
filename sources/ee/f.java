package ee;
public final class f extends md.c {
    public g f8740a;
    public Object f8741b;
    public final g f8742c;
    public int d;

    public f(g gVar, md.c cVar) {
        super(cVar);
        this.f8742c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8741b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8742c.a(null, this);
    }
}
