package m1;
public final class p extends kd.c {
    public b0 f19435a;
    public ie.d f19436b;
    public Object f19437c;
    public final b0 d;
    public int f19438e;

    public p(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f19437c = obj;
        this.f19438e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
