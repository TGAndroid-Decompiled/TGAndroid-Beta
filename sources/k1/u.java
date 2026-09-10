package k1;
public final class u extends kd.c {
    public a0 f12047a;
    public Object f12048b;
    public final a0 f12049c;
    public int d;

    public u(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f12049c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12048b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f12049c.d(this);
    }
}
