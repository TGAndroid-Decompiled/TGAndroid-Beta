package ce;
public final class f extends kd.c {
    public g f4576a;
    public Object f4577b;
    public final g f4578c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4578c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4577b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4578c.a(null, this);
    }
}
