package ia;

public final class k0 extends tc.c {

    public l0 f11041a;

    public Object f11042b;

    public final l0 f11043c;
    public int d;

    public k0(l0 l0Var, tc.c cVar) {
        super(cVar);
        this.f11043c = l0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11042b = obj;
        this.d |= Integer.MIN_VALUE;
        return l0.b(this.f11043c, this);
    }
}
