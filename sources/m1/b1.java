package m1;
public final class b1 extends kd.c {
    public ie.d f19344a;
    public boolean f19345b;
    public Object f19346c;
    public final d1 d;
    public int f19347e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19346c = obj;
        this.f19347e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
