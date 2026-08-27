package k1;

public final class o extends tc.c {

    public Object f14281a;

    public int f14282b;

    public final ia.b0 f14283c;

    public o(ia.b0 b0Var, tc.c cVar) {
        super(cVar);
        this.f14283c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14281a = obj;
        this.f14282b |= Integer.MIN_VALUE;
        return this.f14283c.c(null, this);
    }
}
