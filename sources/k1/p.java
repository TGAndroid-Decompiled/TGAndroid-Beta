package k1;
public final class p extends uc.c {
    public Object f13280a;
    public int f13281b;
    public final ja.a0 f13282c;

    public p(ja.a0 a0Var, uc.c cVar) {
        super(cVar);
        this.f13282c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13280a = obj;
        this.f13281b |= Integer.MIN_VALUE;
        return this.f13282c.c(null, this);
    }
}
