package m1;
public final class a1 extends kd.c {
    public Object f20316a;
    public ie.d f20317b;
    public Object f20318c;
    public final d1 d;
    public int f20319e;

    public a1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20318c = obj;
        this.f20319e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
