package k1;
public final class t extends sc.c {
    public z f14484a;
    public Object f14485b;
    public final z f14486c;
    public int d;

    public t(z zVar, sc.c cVar) {
        super(cVar);
        this.f14486c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14485b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14486c.d(this);
    }
}
