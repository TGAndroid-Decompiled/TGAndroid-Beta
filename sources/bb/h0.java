package bb;
public final class h0 extends ed.c {
    public Object f2565a;
    public final k0 f2566b;
    public int f2567c;

    public h0(k0 k0Var, ed.c cVar) {
        super(cVar);
        this.f2566b = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2565a = obj;
        this.f2567c |= Integer.MIN_VALUE;
        return k0.a(this.f2566b, this);
    }
}
