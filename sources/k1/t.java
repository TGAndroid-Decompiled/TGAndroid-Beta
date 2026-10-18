package k1;
public final class t extends md.c {
    public z f14611a;
    public Object f14612b;
    public final z f14613c;
    public int d;

    public t(z zVar, md.c cVar) {
        super(cVar);
        this.f14613c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14612b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14613c.e(this);
    }
}
