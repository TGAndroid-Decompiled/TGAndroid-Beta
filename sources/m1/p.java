package m1;
public final class p extends kd.c {
    public b0 f20393a;
    public ie.d f20394b;
    public Object f20395c;
    public final b0 d;
    public int f20396e;

    public p(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20395c = obj;
        this.f20396e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
