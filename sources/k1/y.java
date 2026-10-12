package k1;
public final class y extends ld.c {
    public a0 f14391a;
    public Object f14392b;
    public Object f14393c;
    public Object d;
    public final a0 f14394e;
    public int f14395f;

    public y(a0 a0Var, ld.c cVar) {
        super(cVar);
        this.f14394e = a0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f14395f |= Integer.MIN_VALUE;
        return this.f14394e.i(null, null, this);
    }
}
