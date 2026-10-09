package k1;
public final class y extends ld.c {
    public a0 f14394a;
    public Object f14395b;
    public Object f14396c;
    public Object d;
    public final a0 f14397e;
    public int f14398f;

    public y(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14397e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14398f |= Integer.MIN_VALUE;
        return this.f14397e.i(null, null, this);
    }
}
