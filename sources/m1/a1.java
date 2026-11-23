package m1;
public final class a1 extends kd.c {
    public Object f20381a;
    public ie.d f20382b;
    public Object f20383c;
    public final d1 d;
    public int f20384e;

    public a1(d1 d1Var, kd.c cVar) {
        super(cVar);
        this.d = d1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20383c = obj;
        this.f20384e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
