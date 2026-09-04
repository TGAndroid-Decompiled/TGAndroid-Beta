package k1;
public final class y extends kd.c {
    public a0 f14501a;
    public Object f14502b;
    public Object f14503c;
    public Object d;
    public final a0 f14504e;
    public int f14505f;

    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14504e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14505f |= Integer.MIN_VALUE;
        return this.f14504e.i(null, null, this);
    }
}
