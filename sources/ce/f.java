package ce;
public final class f extends kd.c {
    public g f4650a;
    public Object f4651b;
    public final g f4652c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4652c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4651b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4652c.a(null, this);
    }
}
