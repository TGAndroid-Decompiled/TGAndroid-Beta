package m1;
public final class p extends kd.c {
    public b0 f20489a;
    public ie.d f20490b;
    public Object f20491c;
    public final b0 d;
    public int f20492e;

    public p(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20491c = obj;
        this.f20492e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
