package k1;
public final class y extends kd.c {
    public a0 f14357a;
    public Object f14358b;
    public Object f14359c;
    public Object d;
    public final a0 f14360e;
    public int f14361f;

    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14360e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14361f |= Integer.MIN_VALUE;
        return this.f14360e.h(null, null, this);
    }
}
