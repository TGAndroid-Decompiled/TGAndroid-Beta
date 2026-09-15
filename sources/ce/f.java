package ce;
public final class f extends kd.c {
    public g f4231a;
    public Object f4232b;
    public final g f4233c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4233c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4232b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4233c.a(null, this);
    }
}
