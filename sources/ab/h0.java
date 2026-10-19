package ab;
public final class h0 extends md.c {
    public Object f407a;
    public final k0 f408b;
    public int f409c;

    public h0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.f408b = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f407a = obj;
        this.f409c |= Integer.MIN_VALUE;
        return k0.a(this.f408b, this);
    }
}
