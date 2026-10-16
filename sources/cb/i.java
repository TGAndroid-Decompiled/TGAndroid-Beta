package cb;
public final class i extends md.c {
    public Object f4702a;
    public final k f4703b;
    public int f4704c;

    public i(k kVar, md.c cVar) {
        super(cVar);
        this.f4703b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4702a = obj;
        this.f4704c |= Integer.MIN_VALUE;
        return this.f4703b.c(null, null, this);
    }
}
