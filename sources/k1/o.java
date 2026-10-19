package k1;
public final class o extends md.c {
    public Object f14587a;
    public int f14588b;
    public final ab.a0 f14589c;

    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.f14589c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14587a = obj;
        this.f14588b |= Integer.MIN_VALUE;
        return this.f14589c.a(null, this);
    }
}
