package cb;
public final class i extends md.c {
    public Object f5070a;
    public final k f5071b;
    public int f5072c;

    public i(k kVar, md.c cVar) {
        super(cVar);
        this.f5071b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5070a = obj;
        this.f5072c |= Integer.MIN_VALUE;
        return this.f5071b.c(null, null, this);
    }
}
