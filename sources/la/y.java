package la;
public final class y extends wc.c {
    public Object f11940a;
    public int f11941b;
    public final k1.s f11942c;

    public y(k1.s sVar, wc.c cVar) {
        super(cVar);
        this.f11942c = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11940a = obj;
        this.f11941b |= Integer.MIN_VALUE;
        return this.f11942c.c(null, this);
    }
}
