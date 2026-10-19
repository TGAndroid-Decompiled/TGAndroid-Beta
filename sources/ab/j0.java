package ab;
public final class j0 extends md.c {
    public k0 f423a;
    public Object f424b;
    public final k0 f425c;
    public int d;

    public j0(k0 k0Var, md.c cVar) {
        super(cVar);
        this.f425c = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f424b = obj;
        this.d |= Integer.MIN_VALUE;
        return k0.b(this.f425c, this);
    }
}
