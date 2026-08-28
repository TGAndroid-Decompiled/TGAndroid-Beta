package ha;
public final class j0 extends sc.c {
    public k0 f10327a;
    public Object f10328b;
    public final k0 f10329c;
    public int d;

    public j0(k0 k0Var, sc.c cVar) {
        super(cVar);
        this.f10329c = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10328b = obj;
        this.d |= Integer.MIN_VALUE;
        return k0.b(this.f10329c, this);
    }
}
