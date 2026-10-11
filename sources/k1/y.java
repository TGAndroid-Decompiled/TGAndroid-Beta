package k1;
public final class y extends ld.c {
    public a0 f14393a;
    public Object f14394b;
    public Object f14395c;
    public Object d;
    public final a0 f14396e;
    public int f14397f;

    public y(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14396e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14397f |= Integer.MIN_VALUE;
        return this.f14396e.i(null, null, this);
    }
}
