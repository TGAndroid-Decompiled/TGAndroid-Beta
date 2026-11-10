package o1;
public final class c extends kd.c {
    public d f20703a;
    public Object f20704b;
    public final d f20705c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f20705c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20704b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20705c.a(null, this);
    }
}
