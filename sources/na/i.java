package na;
public final class i extends wc.c {
    public Object f14886a;
    public final k f14887b;
    public int f14888c;

    public i(k kVar, wc.c cVar) {
        super(cVar);
        this.f14887b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14886a = obj;
        this.f14888c |= Integer.MIN_VALUE;
        return this.f14887b.c(null, null, this);
    }
}
