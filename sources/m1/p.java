package m1;
public final class p extends kd.c {
    public b0 f20424a;
    public ie.d f20425b;
    public Object f20426c;
    public final b0 d;
    public int f20427e;

    public p(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20426c = obj;
        this.f20427e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
