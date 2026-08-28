package ja;
public final class i extends sc.c {
    public Object f14273a;
    public final k f14274b;
    public int f14275c;

    public i(k kVar, sc.c cVar) {
        super(cVar);
        this.f14274b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14273a = obj;
        this.f14275c |= Integer.MIN_VALUE;
        return this.f14274b.c(null, null, this);
    }
}
