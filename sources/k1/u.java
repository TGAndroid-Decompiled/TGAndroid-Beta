package k1;

public final class u extends tc.c {

    public z f14308a;

    public Object f14309b;

    public final z f14310c;
    public int d;

    public u(z zVar, tc.c cVar) {
        super(cVar);
        this.f14310c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14309b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14310c.f(this);
    }
}
