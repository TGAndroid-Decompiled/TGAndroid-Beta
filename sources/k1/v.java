package k1;
public final class v extends kd.c {
    public a0 f14346a;
    public Object f14347b;
    public final a0 f14348c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14348c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14347b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14348c.e(this);
    }
}
