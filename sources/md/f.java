package md;
public final class f extends uc.c {
    public g f16988a;
    public Object f16989b;
    public final g f16990c;
    public int d;

    public f(g gVar, uc.c cVar) {
        super(cVar);
        this.f16990c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16989b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16990c.c(null, this);
    }
}
