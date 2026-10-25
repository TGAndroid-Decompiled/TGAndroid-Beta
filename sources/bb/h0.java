package bb;
public final class h0 extends nd.c {
    public Object f3765a;
    public final k0 f3766b;
    public int f3767c;

    public h0(k0 k0Var, nd.c cVar) {
        super(cVar);
        this.f3766b = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f3765a = obj;
        this.f3767c |= Integer.MIN_VALUE;
        return k0.a(this.f3766b, this);
    }
}
