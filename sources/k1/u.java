package k1;
public final class u extends ed.c {
    public z f10568a;
    public Object f10569b;
    public final z f10570c;
    public int d;

    public u(z zVar, ed.c cVar) {
        super(cVar);
        this.f10570c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10569b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10570c.f(this);
    }
}
