package k1;
public final class u extends md.c {
    public z f14657a;
    public Object f14658b;
    public final z f14659c;
    public int d;

    public u(z zVar, md.c cVar) {
        super(cVar);
        this.f14659c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14658b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14659c.f(this);
    }
}
