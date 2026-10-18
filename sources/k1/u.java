package k1;
public final class u extends md.c {
    public z f14614a;
    public Object f14615b;
    public final z f14616c;
    public int d;

    public u(z zVar, md.c cVar) {
        super(cVar);
        this.f14616c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14615b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14616c.f(this);
    }
}
