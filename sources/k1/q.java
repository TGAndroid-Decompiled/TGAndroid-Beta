package k1;
public final class q extends uc.c {
    public Object f13283a;
    public a0 f13284b;
    public jd.t f13285c;
    public Object d;
    public final a0 f13286e;
    public int f13287f;

    public q(a0 a0Var, uc.c cVar) {
        super(cVar);
        this.f13286e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f13287f |= Integer.MIN_VALUE;
        return a0.a(this.f13286e, null, this);
    }
}
