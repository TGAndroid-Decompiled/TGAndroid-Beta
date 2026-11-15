package o1;
public final class c extends kd.c {
    public d f21219a;
    public Object f21220b;
    public final d f21221c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f21221c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f21220b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f21221c.a(null, this);
    }
}
