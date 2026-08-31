package od;
public final class f extends wc.c {
    public g f16722a;
    public Object f16723b;
    public final g f16724c;
    public int d;

    public f(g gVar, wc.c cVar) {
        super(cVar);
        this.f16724c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16723b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16724c.c(null, this);
    }
}
