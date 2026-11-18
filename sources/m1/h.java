package m1;
public final class h extends kd.c {
    public ab.c0 f20342a;
    public Object f20343b;
    public final ab.c0 f20344c;
    public int d;

    public h(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.f20344c = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20343b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20344c.e(this);
    }
}
