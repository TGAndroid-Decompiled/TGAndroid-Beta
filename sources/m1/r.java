package m1;
public final class r extends kd.c {
    public b0 f20437a;
    public ie.d f20438b;
    public Object f20439c;
    public final b0 d;
    public int f20440e;

    public r(b0 b0Var, kd.c cVar) {
        super(cVar);
        this.d = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20439c = obj;
        this.f20440e |= Integer.MIN_VALUE;
        return b0.d(this.d, this);
    }
}
