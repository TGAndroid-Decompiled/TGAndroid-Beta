package ee;
public final class f extends md.c {
    public g f8629a;
    public Object f8630b;
    public final g f8631c;
    public int d;

    public f(g gVar, md.c cVar) {
        super(cVar);
        this.f8631c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8630b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8631c.a(null, this);
    }
}
