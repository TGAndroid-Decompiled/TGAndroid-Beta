package m1;
public final class b1 extends kd.c {
    public ie.d f20299a;
    public boolean f20300b;
    public Object f20301c;
    public final d1 d;
    public int f20302e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20301c = obj;
        this.f20302e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
