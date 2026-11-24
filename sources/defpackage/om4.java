package defpackage;
public final class om4 extends qx2 {
    public Object a;
    public int b;
    public final mj4 c;
    public mj4 d;
    public jm4 e;
    public pq9 f;

    public om4(mj4 mj4Var, px2 px2Var) {
        super(px2Var);
        this.c = mj4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
