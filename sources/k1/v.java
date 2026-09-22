package k1;
public final class v extends kd.c {
    public a0 f13205a;
    public Object f13206b;
    public final a0 f13207c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f13207c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13206b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13207c.e(this);
    }
}
