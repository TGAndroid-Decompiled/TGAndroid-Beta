package m1;
public final class b1 extends kd.c {
    public ie.d f19938a;
    public boolean f19939b;
    public Object f19940c;
    public final d1 d;
    public int f19941e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19940c = obj;
        this.f19941e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
