package k1;
public final class o extends md.c {
    public Object f14588a;
    public int f14589b;
    public final ab.a0 f14590c;

    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.f14590c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14588a = obj;
        this.f14589b |= Integer.MIN_VALUE;
        return this.f14590c.a(null, this);
    }
}
