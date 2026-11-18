package m1;
public final class b1 extends kd.c {
    public ie.d f20302a;
    public boolean f20303b;
    public Object f20304c;
    public final d1 d;
    public int f20305e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20304c = obj;
        this.f20305e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
