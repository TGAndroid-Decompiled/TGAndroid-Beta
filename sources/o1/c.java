package o1;
public final class c extends kd.c {
    public d f21676a;
    public Object f21677b;
    public final d f21678c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f21678c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f21677b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f21678c.a(null, this);
    }
}
