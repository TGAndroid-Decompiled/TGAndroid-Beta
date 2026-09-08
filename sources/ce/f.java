package ce;
public final class f extends kd.c {
    public g f4796a;
    public Object f4797b;
    public final g f4798c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4798c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4797b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4798c.a(null, this);
    }
}
