package m1;
public final class b1 extends kd.c {
    public ie.d f19349a;
    public boolean f19350b;
    public Object f19351c;
    public final d1 d;
    public int f19352e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19351c = obj;
        this.f19352e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
