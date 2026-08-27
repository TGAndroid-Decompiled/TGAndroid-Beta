package ka;

public final class i extends tc.c {

    public Object f15127a;

    public final k f15128b;

    public int f15129c;

    public i(k kVar, tc.c cVar) {
        super(cVar);
        this.f15128b = kVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15127a = obj;
        this.f15129c |= Integer.MIN_VALUE;
        return this.f15128b.c(null, null, this);
    }
}
