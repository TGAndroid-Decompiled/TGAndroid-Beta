package cb;
public final class i extends md.c {
    public Object f5072a;
    public final k f5073b;
    public int f5074c;

    public i(k kVar, md.c cVar) {
        super(cVar);
        this.f5073b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5072a = obj;
        this.f5074c |= Integer.MIN_VALUE;
        return this.f5073b.c(null, null, this);
    }
}
