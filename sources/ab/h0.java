package ab;
public final class h0 extends md.c {
    public Object f405a;
    public final k0 f406b;
    public int f407c;

    public h0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.f406b = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f405a = obj;
        this.f407c |= Integer.MIN_VALUE;
        return k0.a(this.f406b, this);
    }
}
