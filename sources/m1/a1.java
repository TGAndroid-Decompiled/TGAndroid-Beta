package m1;
public final class a1 extends kd.c {
    public Object f19924a;
    public ie.d f19925b;
    public Object f19926c;
    public final d1 d;
    public int f19927e;

    public a1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19926c = obj;
        this.f19927e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
