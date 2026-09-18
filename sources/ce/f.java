package ce;
public final class f extends kd.c {
    public g f4236a;
    public Object f4237b;
    public final g f4238c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4238c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4237b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4238c.a(null, this);
    }
}
