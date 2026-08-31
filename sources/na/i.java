package na;
public final class i extends wc.c {
    public Object f15900a;
    public final k f15901b;
    public int f15902c;

    public i(k kVar, wc.c cVar) {
        super(cVar);
        this.f15901b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15900a = obj;
        this.f15902c |= Integer.MIN_VALUE;
        return this.f15901b.c(null, null, this);
    }
}
