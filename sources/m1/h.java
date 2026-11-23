package m1;
public final class h extends kd.c {
    public ab.c0 f20373a;
    public Object f20374b;
    public final ab.c0 f20375c;
    public int d;

    public h(ab.c0 c0Var, kd.c cVar) {
        super(cVar);
        this.f20375c = c0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20374b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20375c.e(this);
    }
}
