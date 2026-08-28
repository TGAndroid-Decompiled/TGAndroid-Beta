package ha;
public final class h0 extends sc.c {
    public Object f10309a;
    public final k0 f10310b;
    public int f10311c;

    public h0(k0 k0Var, sc.c cVar) {
        super(cVar);
        this.f10310b = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10309a = obj;
        this.f10311c |= Integer.MIN_VALUE;
        return k0.a(this.f10310b, this);
    }
}
