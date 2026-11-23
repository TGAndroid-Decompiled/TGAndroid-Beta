package m1;
public final class a1 extends kd.c {
    public Object f20319a;
    public ie.d f20320b;
    public Object f20321c;
    public final d1 d;
    public int f20322e;

    public a1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20321c = obj;
        this.f20322e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
