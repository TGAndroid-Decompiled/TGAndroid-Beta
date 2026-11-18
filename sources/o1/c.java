package o1;
public final class c extends kd.c {
    public d f21583a;
    public Object f21584b;
    public final d f21585c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f21585c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f21584b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f21585c.a(null, this);
    }
}
