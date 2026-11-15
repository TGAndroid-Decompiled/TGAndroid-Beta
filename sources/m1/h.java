package m1;
public final class h extends kd.c {
    public ab.c0 f19978a;
    public Object f19979b;
    public final ab.c0 f19980c;
    public int d;

    public h(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.f19980c = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19979b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19980c.e(this);
    }
}
