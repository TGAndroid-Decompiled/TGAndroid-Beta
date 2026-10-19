package k1;
public final class o extends md.c {
    public Object f14589a;
    public int f14590b;
    public final ab.a0 f14591c;

    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.f14591c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14589a = obj;
        this.f14590b |= Integer.MIN_VALUE;
        return this.f14591c.a(null, this);
    }
}
