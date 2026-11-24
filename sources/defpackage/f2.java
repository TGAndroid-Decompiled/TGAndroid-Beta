package defpackage;
public final class f2 extends qx2 {
    public pq9 a;
    public Object b;
    public final oo8 c;
    public int d;

    public f2(oo8 oo8Var, px2 px2Var) {
        super(px2Var);
        this.c = oo8Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
