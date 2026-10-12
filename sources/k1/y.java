package k1;
public final class y extends ld.c {
    public a0 f14390a;
    public Object f14391b;
    public Object f14392c;
    public Object d;
    public final a0 f14393e;
    public int f14394f;

    public y(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14393e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14394f |= Integer.MIN_VALUE;
        return this.f14393e.i(null, null, this);
    }
}
