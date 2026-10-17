package ab;
public final class z extends md.c {
    public Object f477a;
    public int f478b;
    public final a0 f479c;

    public z(a0 a0Var, md.c cVar) {
        super(cVar);
        this.f479c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f477a = obj;
        this.f478b |= Integer.MIN_VALUE;
        return this.f479c.a(null, this);
    }
}
