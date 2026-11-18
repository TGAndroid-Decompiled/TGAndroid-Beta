package m1;
public final class b1 extends kd.c {
    public ie.d f20305a;
    public boolean f20306b;
    public Object f20307c;
    public final d1 d;
    public int f20308e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20307c = obj;
        this.f20308e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
