package ab;
public final class h0 extends md.c {
    public Object f409a;
    public final k0 f410b;
    public int f411c;

    public h0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.f410b = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f409a = obj;
        this.f411c |= Integer.MIN_VALUE;
        return k0.a(this.f410b, this);
    }
}
