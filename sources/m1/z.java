package m1;
public final class z extends kd.c {
    public kotlin.jvm.internal.p f20474a;
    public Object f20475b;
    public final b0 f20476c;
    public int d;

    public z(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20476c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20475b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20476c.j(null, false, this);
    }
}
