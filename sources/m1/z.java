package m1;
public final class z extends kd.c {
    public kotlin.jvm.internal.p f20499a;
    public Object f20500b;
    public final b0 f20501c;
    public int d;

    public z(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20501c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20500b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20501c.j(null, false, this);
    }
}
