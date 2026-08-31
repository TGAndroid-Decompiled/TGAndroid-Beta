package k1;
public final class y extends wc.c {
    public d0 f10331a;
    public Object f10332b;
    public final d0 f10333c;
    public int d;

    public y(d0 d0Var, wc.c cVar) {
        super(cVar);
        this.f10333c = d0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10332b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f10333c.f(this);
    }
}
