package k1;
public final class r extends wc.c {
    public Object f10302a;
    public int f10303b;
    public final s f10304c;

    public r(s sVar, wc.c cVar) {
        super(cVar);
        this.f10304c = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10302a = obj;
        this.f10303b |= Integer.MIN_VALUE;
        return this.f10304c.c(null, this);
    }
}
