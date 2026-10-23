package k1;
public final class t extends md.c {
    public z f14654a;
    public Object f14655b;
    public final z f14656c;
    public int d;

    public t(z zVar, md.c cVar) {
        super(cVar);
        this.f14656c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14655b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14656c.e(this);
    }
}
