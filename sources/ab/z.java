package ab;
public final class z extends md.c {
    public Object f474a;
    public int f475b;
    public final a0 f476c;

    public z(a0 a0Var, md.c cVar) {
        super(cVar);
        this.f476c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f474a = obj;
        this.f475b |= Integer.MIN_VALUE;
        return this.f476c.a(null, this);
    }
}
