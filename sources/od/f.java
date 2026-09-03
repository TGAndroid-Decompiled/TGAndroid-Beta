package od;
public final class f extends wc.c {
    public g f16535a;
    public Object f16536b;
    public final g f16537c;
    public int d;

    public f(g gVar, wc.c cVar) {
        super(cVar);
        this.f16537c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16536b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16537c.c(null, this);
    }
}
