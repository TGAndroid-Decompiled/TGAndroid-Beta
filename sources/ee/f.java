package ee;
public final class f extends md.c {
    public g f8624a;
    public Object f8625b;
    public final g f8626c;
    public int d;

    public f(g gVar, md.c cVar) {
        super(cVar);
        this.f8626c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8625b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8626c.a(null, this);
    }
}
