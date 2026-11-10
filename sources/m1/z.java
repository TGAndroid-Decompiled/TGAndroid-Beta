package m1;
public final class z extends kd.c {
    public kotlin.jvm.internal.p f19518a;
    public Object f19519b;
    public final b0 f19520c;
    public int d;

    public z(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19520c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19519b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19520c.j(null, false, this);
    }
}
