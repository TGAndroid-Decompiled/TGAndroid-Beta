package o1;
public final class c extends kd.c {
    public d f21586a;
    public Object f21587b;
    public final d f21588c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f21588c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f21587b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f21588c.a(null, this);
    }
}
