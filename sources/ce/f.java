package ce;
public final class f extends kd.c {
    public g f4237a;
    public Object f4238b;
    public final g f4239c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4239c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4238b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4239c.a(null, this);
    }
}
