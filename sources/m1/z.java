package m1;
public final class z extends kd.c {
    public kotlin.jvm.internal.p f20564a;
    public Object f20565b;
    public final b0 f20566c;
    public int d;

    public z(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20566c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20565b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20566c.j(null, false, this);
    }
}
