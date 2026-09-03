package na;
public final class i extends wc.c {
    public Object f15902a;
    public final k f15903b;
    public int f15904c;

    public i(k kVar, wc.c cVar) {
        super(cVar);
        this.f15903b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15902a = obj;
        this.f15904c |= Integer.MIN_VALUE;
        return this.f15903b.c(null, null, this);
    }
}
