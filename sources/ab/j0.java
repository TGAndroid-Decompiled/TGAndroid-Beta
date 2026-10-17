package ab;
public final class j0 extends md.c {
    public k0 f424a;
    public Object f425b;
    public final k0 f426c;
    public int d;

    public j0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.f426c = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f425b = obj;
        this.d |= Integer.MIN_VALUE;
        return k0.b(this.f426c, this);
    }
}
