package o1;
public final class c extends kd.c {
    public d f21611a;
    public Object f21612b;
    public final d f21613c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f21613c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f21612b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f21613c.a(null, this);
    }
}
