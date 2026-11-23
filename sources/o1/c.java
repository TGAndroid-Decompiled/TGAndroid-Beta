package o1;
public final class c extends kd.c {
    public d f21577a;
    public Object f21578b;
    public final d f21579c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f21579c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f21578b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f21579c.a(null, this);
    }
}
