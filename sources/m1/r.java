package m1;
public final class r extends kd.c {
    public b0 f20406a;
    public ie.d f20407b;
    public Object f20408c;
    public final b0 d;
    public int f20409e;

    public r(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20408c = obj;
        this.f20409e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
