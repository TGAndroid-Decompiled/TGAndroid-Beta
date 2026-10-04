package k1;
public final class y extends kd.c {
    public a0 f14358a;
    public Object f14359b;
    public Object f14360c;
    public Object d;
    public final a0 f14361e;
    public int f14362f;

    public y(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14361e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14362f |= Integer.MIN_VALUE;
        return this.f14361e.h(null, null, this);
    }
}
