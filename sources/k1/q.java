package k1;
public final class q extends kd.c {
    public Object f12029a;
    public a0 f12030b;
    public zd.t f12031c;
    public Object d;
    public final a0 e;
    public int f12032f;

    public q(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f12032f |= Integer.MIN_VALUE;
        return a0.a(this.e, null, this);
    }
}
