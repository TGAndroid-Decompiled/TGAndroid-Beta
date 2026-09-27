package ce;
public final class f extends kd.c {
    public g f4230a;
    public Object f4231b;
    public final g f4232c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4232c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4231b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4232c.a(null, this);
    }
}
