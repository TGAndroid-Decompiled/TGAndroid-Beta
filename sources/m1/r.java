package m1;
public final class r extends kd.c {
    public b0 f20502a;
    public ie.d f20503b;
    public Object f20504c;
    public final b0 d;
    public int f20505e;

    public r(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20504c = obj;
        this.f20505e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
