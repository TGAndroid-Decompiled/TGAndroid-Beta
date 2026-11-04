package l1;
public final class p extends hd.c {
    public b0 f17598a;
    public fe.d f17599b;
    public Object f17600c;
    public final b0 d;
    public int f17601e;

    public p(b0 b0Var, hd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17600c = obj;
        this.f17601e |= Integer.MIN_VALUE;
        return b0.b(this.d, this);
    }
}
