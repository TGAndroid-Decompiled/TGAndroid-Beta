package m1;
public final class b1 extends kd.c {
    public ie.d f19341a;
    public boolean f19342b;
    public Object f19343c;
    public final d1 d;
    public int f19344e;

    public b1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19343c = obj;
        this.f19344e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
