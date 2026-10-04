package ce;
public final class f extends kd.c {
    public g f4575a;
    public Object f4576b;
    public final g f4577c;
    public int d;

    public f(g gVar, kd.c cVar) {
        super(cVar);
        this.f4577c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4576b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f4577c.a(null, this);
    }
}
