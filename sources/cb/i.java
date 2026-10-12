package cb;
public final class i extends md.c {
    public Object f4699a;
    public final k f4700b;
    public int f4701c;

    public i(k kVar, md.c cVar) {
        super(cVar);
        this.f4700b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4699a = obj;
        this.f4701c |= Integer.MIN_VALUE;
        return this.f4700b.c(null, null, this);
    }
}
