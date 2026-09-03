package k1;
public final class r extends wc.c {
    public Object f9578a;
    public int f9579b;
    public final s f9580c;

    public r(s sVar, wc.c cVar) {
        super(cVar);
        this.f9580c = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9578a = obj;
        this.f9579b |= Integer.MIN_VALUE;
        return this.f9580c.c(null, this);
    }
}
