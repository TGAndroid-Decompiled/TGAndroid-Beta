package ia;

public final class i0 extends tc.c {

    public Object f11024a;

    public final l0 f11025b;

    public int f11026c;

    public i0(l0 l0Var, tc.c cVar) {
        super(cVar);
        this.f11025b = l0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f11024a = obj;
        this.f11026c |= Integer.MIN_VALUE;
        return l0.a(this.f11025b, this);
    }
}
