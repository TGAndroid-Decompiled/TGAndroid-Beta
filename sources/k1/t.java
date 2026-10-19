package k1;
public final class t extends md.c {
    public z f14610a;
    public Object f14611b;
    public final z f14612c;
    public int d;

    public t(z zVar, md.c cVar) {
        super(cVar);
        this.f14612c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14611b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14612c.d(this);
    }
}
