package m1;
public final class b1 extends kd.c {
    public ie.d f20330a;
    public boolean f20331b;
    public Object f20332c;
    public final d1 d;
    public int f20333e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20332c = obj;
        this.f20333e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
