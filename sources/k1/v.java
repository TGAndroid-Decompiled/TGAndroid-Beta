package k1;
public final class v extends kd.c {
    public a0 f12050a;
    public Object f12051b;
    public final a0 f12052c;
    public int d;

    public v(a0 a0Var, kd.c cVar) {
        super(cVar);
        this.f12052c = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12051b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f12052c.e(this);
    }
}
