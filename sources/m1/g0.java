package m1;
public final class g0 extends kd.c {
    public i0 f20429a;
    public d0 f20430b;
    public boolean f20431c;
    public Object d;
    public final i0 f20432e;
    public int f20433f;

    public g0(i0 i0Var, kd.c cVar) {
        super(cVar);
        this.f20432e = i0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f20433f |= Integer.MIN_VALUE;
        return this.f20432e.a(null, this);
    }
}
