package m1;
public final class a1 extends kd.c {
    public Object f20288a;
    public ie.d f20289b;
    public Object f20290c;
    public final d1 d;
    public int f20291e;

    public a1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20290c = obj;
        this.f20291e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
