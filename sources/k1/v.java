package k1;
public final class v extends kd.c {
    public a0 f14347a;
    public Object f14348b;
    public final a0 f14349c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14349c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14348b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14349c.e(this);
    }
}
