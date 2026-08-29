package la;
public final class i extends uc.c {
    public Object f15131a;
    public final k f15132b;
    public int f15133c;

    public i(k kVar, uc.c cVar) {
        super(cVar);
        this.f15132b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15131a = obj;
        this.f15133c |= Integer.MIN_VALUE;
        return this.f15132b.c(null, null, this);
    }
}
