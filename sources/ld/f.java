package ld;

public final class f extends tc.c {

    public g f15548a;

    public Object f15549b;

    public final g f15550c;
    public int d;

    public f(g gVar, tc.c cVar) {
        super(cVar);
        this.f15550c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15549b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f15550c.c(null, this);
    }
}
