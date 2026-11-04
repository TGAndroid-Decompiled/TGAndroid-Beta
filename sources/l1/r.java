package l1;
public final class r extends hd.c {
    public b0 f17611a;
    public fe.d f17612b;
    public Object f17613c;
    public final b0 d;
    public int f17614e;

    public r(b0 b0Var, hd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f17613c = obj;
        this.f17614e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
