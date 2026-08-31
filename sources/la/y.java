package la;
public final class y extends wc.c {
    public Object f12247a;
    public int f12248b;
    public final k1.s f12249c;

    public y(k1.s sVar, wc.c cVar) {
        super(cVar);
        this.f12249c = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12247a = obj;
        this.f12248b |= Integer.MIN_VALUE;
        return this.f12249c.c(null, this);
    }
}
