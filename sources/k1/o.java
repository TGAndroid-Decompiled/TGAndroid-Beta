package k1;
public final class o extends md.c {
    public Object f14633a;
    public int f14634b;
    public final ab.a0 f14635c;

    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.f14635c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14633a = obj;
        this.f14634b |= Integer.MIN_VALUE;
        return this.f14635c.a(null, this);
    }
}
