package ee;
public final class f extends md.c {
    public g f8625a;
    public Object f8626b;
    public final g f8627c;
    public int d;

    public f(g gVar, md.c cVar) {
        super(cVar);
        this.f8627c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8626b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8627c.a(null, this);
    }
}
