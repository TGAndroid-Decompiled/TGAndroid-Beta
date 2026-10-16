package ab;
public final class j0 extends md.c {
    public k0 f425a;
    public Object f426b;
    public final k0 f427c;
    public int d;

    public j0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.f427c = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f426b = obj;
        this.d |= Integer.MIN_VALUE;
        return k0.b(this.f427c, this);
    }
}
