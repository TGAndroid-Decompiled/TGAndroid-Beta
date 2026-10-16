package ab;
public final class z extends md.c {
    public Object f478a;
    public int f479b;
    public final a0 f480c;

    public z(a0 a0Var, md.c cVar) {
        super(cVar);
        this.f480c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f478a = obj;
        this.f479b |= Integer.MIN_VALUE;
        return this.f480c.a(null, this);
    }
}
