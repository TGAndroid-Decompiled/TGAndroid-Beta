package cb;
public final class i extends md.c {
    public Object f5073a;
    public final k f5074b;
    public int f5075c;

    public i(k kVar, md.c cVar) {
        super(cVar);
        this.f5074b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5073a = obj;
        this.f5075c |= Integer.MIN_VALUE;
        return this.f5074b.c(null, null, this);
    }
}
