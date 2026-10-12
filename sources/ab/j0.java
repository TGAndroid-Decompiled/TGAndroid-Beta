package ab;
public final class j0 extends md.c {
    public k0 f421a;
    public Object f422b;
    public final k0 f423c;
    public int d;

    public j0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.f423c = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f422b = obj;
        this.d |= Integer.MIN_VALUE;
        return k0.b(this.f423c, this);
    }
}
