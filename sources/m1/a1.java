package m1;
public final class a1 extends kd.c {
    public Object f20285a;
    public ie.d f20286b;
    public Object f20287c;
    public final d1 d;
    public int f20288e;

    public a1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20287c = obj;
        this.f20288e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
