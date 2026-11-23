package m1;
public final class b1 extends kd.c {
    public ie.d f20333a;
    public boolean f20334b;
    public Object f20335c;
    public final d1 d;
    public int f20336e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20335c = obj;
        this.f20336e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
