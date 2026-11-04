package l1;
public final class q extends hd.c {
    public Object f17604a;
    public b0 f17605b;
    public wd.t f17606c;
    public Object d;
    public final b0 f17607e;
    public int f17608f;

    public q(b0 b0Var, hd.c cVar) {
        super(cVar);
        this.f17607e = b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f17608f |= Integer.MIN_VALUE;
        return b0.c(this.f17607e, null, this);
    }
}
