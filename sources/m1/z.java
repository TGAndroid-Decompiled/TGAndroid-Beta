package m1;
public final class z extends kd.c {
    public kotlin.jvm.internal.p f20471a;
    public Object f20472b;
    public final b0 f20473c;
    public int d;

    public z(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.f20473c = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20472b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20473c.j(null, false, this);
    }
}
