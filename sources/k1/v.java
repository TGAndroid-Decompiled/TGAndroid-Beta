package k1;
public final class v extends kd.c {
    public a0 f14490a;
    public Object f14491b;
    public final a0 f14492c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14492c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14491b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f14492c.e(this);
    }
}
