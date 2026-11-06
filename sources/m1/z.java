package m1;
public final class z extends kd.c {
    public kotlin.jvm.internal.p f19510a;
    public Object f19511b;
    public final b0 f19512c;
    public int d;

    public z(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f19512c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19511b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f19512c.j(null, false, this);
    }
}
