package ab;
public final class h0 extends md.c {
    public Object f408a;
    public final k0 f409b;
    public int f410c;

    public h0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.f409b = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f408a = obj;
        this.f410c |= Integer.MIN_VALUE;
        return k0.a(this.f409b, this);
    }
}
