package ee;
public final class f extends md.c {
    public g f8622a;
    public Object f8623b;
    public final g f8624c;
    public int d;

    public f(g gVar, md.c cVar) {
        super(cVar);
        this.f8624c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8623b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8624c.a(null, this);
    }
}
