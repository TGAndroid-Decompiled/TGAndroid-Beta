package o1;
public final class c extends kd.c {
    public d f20695a;
    public Object f20696b;
    public final d f20697c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f20697c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20696b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20697c.a(null, this);
    }
}
