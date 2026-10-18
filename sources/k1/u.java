package k1;
public final class u extends md.c {
    public z f14612a;
    public Object f14613b;
    public final z f14614c;
    public int d;

    public u(z zVar, md.c cVar) {
        super(cVar);
        this.f14614c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14613b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14614c.f(this);
    }
}
