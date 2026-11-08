package m1;
public final class a1 extends kd.c {
    public Object f19330a;
    public ie.d f19331b;
    public Object f19332c;
    public final d1 d;
    public int f19333e;

    public a1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19332c = obj;
        this.f19333e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
