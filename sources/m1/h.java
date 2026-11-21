package m1;
public final class h extends kd.c {
    public ab.c0 f20370a;
    public Object f20371b;
    public final ab.c0 f20372c;
    public int d;

    public h(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.f20372c = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20371b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20372c.e(this);
    }
}
