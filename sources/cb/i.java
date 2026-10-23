package cb;
public final class i extends md.c {
    public Object f5075a;
    public final k f5076b;
    public int f5077c;

    public i(k kVar, md.c cVar) {
        super(cVar);
        this.f5076b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5075a = obj;
        this.f5077c |= Integer.MIN_VALUE;
        return this.f5076b.c(null, null, this);
    }
}
