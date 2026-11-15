package m1;
public final class r extends kd.c {
    public b0 f20045a;
    public ie.d f20046b;
    public Object f20047c;
    public final b0 d;
    public int f20048e;

    public r(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20047c = obj;
        this.f20048e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
