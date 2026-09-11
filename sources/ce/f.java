package ce;
public final class f extends kd.c {
    public g f4769a;
    public Object f4770b;
    public final g f4771c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4771c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4770b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4771c.a(null, this);
    }
}
