package k1;
public final class o extends md.c {
    public Object f13788a;
    public int f13789b;
    public final ab.a0 f13790c;

    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.f13790c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13788a = obj;
        this.f13789b |= Integer.MIN_VALUE;
        return this.f13790c.a(null, this);
    }
}
