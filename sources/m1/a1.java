package m1;
public final class a1 extends kd.c {
    public Object f20291a;
    public ie.d f20292b;
    public Object f20293c;
    public final d1 d;
    public int f20294e;

    public a1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20293c = obj;
        this.f20294e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
