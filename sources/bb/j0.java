package bb;
public final class j0 extends ed.c {
    public k0 f2582a;
    public Object f2583b;
    public final k0 f2584c;
    public int d;

    public j0(k0 k0Var, ed.c cVar) {
        super(cVar);
        this.f2584c = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f2583b = obj;
        this.d |= Integer.MIN_VALUE;
        return k0.b(this.f2584c, this);
    }
}
