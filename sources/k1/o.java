package k1;
public final class o extends md.c {
    public Object f13785a;
    public int f13786b;
    public final ab.a0 f13787c;

    public o(ab.a0 a0Var, md.c cVar) {
        super(cVar);
        this.f13787c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13785a = obj;
        this.f13786b |= Integer.MIN_VALUE;
        return this.f13787c.a(null, this);
    }
}
