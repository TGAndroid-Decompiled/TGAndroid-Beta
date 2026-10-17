package k1;
public final class t extends md.c {
    public z f14604a;
    public Object f14605b;
    public final z f14606c;
    public int d;

    public t(z zVar, md.c cVar) {
        super(cVar);
        this.f14606c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14605b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14606c.e(this);
    }
}
