package k1;
public final class o extends md.c {
    public Object f14583a;
    public int f14584b;
    public final ab.a0 f14585c;

    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.f14585c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14583a = obj;
        this.f14584b |= Integer.MIN_VALUE;
        return this.f14585c.a(null, this);
    }
}
