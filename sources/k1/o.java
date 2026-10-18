package k1;
public final class o extends md.c {
    public Object f14590a;
    public int f14591b;
    public final ab.a0 f14592c;

    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.f14592c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14590a = obj;
        this.f14591b |= Integer.MIN_VALUE;
        return this.f14592c.a(null, this);
    }
}
