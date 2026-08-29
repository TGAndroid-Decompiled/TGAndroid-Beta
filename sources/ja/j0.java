package ja;
public final class j0 extends uc.c {
    public k0 f11362a;
    public Object f11363b;
    public final k0 f11364c;
    public int d;

    public j0(k0 k0Var, uc.c cVar) {
        super(cVar);
        this.f11364c = k0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11363b = obj;
        this.d |= Integer.MIN_VALUE;
        return k0.b(this.f11364c, this);
    }
}
