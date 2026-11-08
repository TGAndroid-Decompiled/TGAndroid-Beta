package m1;
public final class z extends kd.c {
    public kotlin.jvm.internal.p f19513a;
    public Object f19514b;
    public final b0 f19515c;
    public int d;

    public z(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19515c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19514b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19515c.j(null, false, this);
    }
}
