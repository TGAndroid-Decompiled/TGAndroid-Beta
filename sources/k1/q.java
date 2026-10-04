package k1;
public final class q extends kd.c {
    public Object f14323a;
    public a0 f14324b;
    public zd.t f14325c;
    public Object d;
    public final a0 f14326e;
    public int f14327f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f14326e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14327f |= Integer.MIN_VALUE;
        return a0.a(this.f14326e, null, this);
    }
}
