package m1;
public final class h extends kd.c {
    public ab.c0 f20339a;
    public Object f20340b;
    public final ab.c0 f20341c;
    public int d;

    public h(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.f20341c = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20340b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20341c.e(this);
    }
}
