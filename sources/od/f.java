package od;
public final class f extends wc.c {
    public g f16724a;
    public Object f16725b;
    public final g f16726c;
    public int d;

    public f(g gVar, wc.c cVar) {
        super(cVar);
        this.f16726c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16725b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16726c.c(null, this);
    }
}
