package ab;
public final class z extends md.c {
    public Object f476a;
    public int f477b;
    public final a0 f478c;

    public z(a0 a0Var, md.c cVar) {
        super(cVar);
        this.f478c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f476a = obj;
        this.f477b |= Integer.MIN_VALUE;
        return this.f478c.a(null, this);
    }
}
