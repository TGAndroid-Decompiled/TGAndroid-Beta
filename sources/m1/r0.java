package m1;
public final class r0 extends kd.c {
    public Object f20506a;
    public Object f20507b;
    public Object f20508c;
    public Object d;
    public final t0 f20509e;
    public int f20510f;

    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20509e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20510f |= Integer.MIN_VALUE;
        return this.f20509e.c(null, this);
    }
}
