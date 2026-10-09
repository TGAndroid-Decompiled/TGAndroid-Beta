package k1;
public final class q extends ld.c {
    public Object f14359a;
    public a0 f14360b;
    public ae.t f14361c;
    public Object d;
    public final a0 f14362e;
    public int f14363f;

    public q(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14362e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14363f |= Integer.MIN_VALUE;
        return a0.a(this.f14362e, null, this);
    }
}
