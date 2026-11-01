package k1;
public final class u extends ed.c {
    public z f10569a;
    public Object f10570b;
    public final z f10571c;
    public int d;

    public u(z zVar, ed.c cVar) {
        super(cVar);
        this.f10571c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10570b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10571c.f(this);
    }
}
