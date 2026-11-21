package m1;
public final class r0 extends kd.c {
    public Object f20441a;
    public Object f20442b;
    public Object f20443c;
    public Object d;
    public final t0 f20444e;
    public int f20445f;

    public r0(t0 t0Var, kd.c cVar) {
        super(cVar);
        this.f20444e = t0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20445f |= Integer.MIN_VALUE;
        return this.f20444e.c(null, this);
    }
}
