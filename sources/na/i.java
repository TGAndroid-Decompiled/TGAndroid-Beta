package na;
public final class i extends wc.c {
    public Object f14871a;
    public final k f14872b;
    public int f14873c;

    public i(k kVar, wc.c cVar) {
        super(cVar);
        this.f14872b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14871a = obj;
        this.f14873c |= Integer.MIN_VALUE;
        return this.f14872b.c(null, null, this);
    }
}
