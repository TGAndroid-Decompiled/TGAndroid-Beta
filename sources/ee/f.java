package ee;
public final class f extends md.c {
    public g f8623a;
    public Object f8624b;
    public final g f8625c;
    public int d;

    public f(g gVar, md.c cVar) {
        super(cVar);
        this.f8625c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8624b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8625c.a(null, this);
    }
}
