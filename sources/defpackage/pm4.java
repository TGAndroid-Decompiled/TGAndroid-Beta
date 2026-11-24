package defpackage;
public final class pm4 extends qx2 {
    public Object a;
    public int b;
    public final lx6 c;
    public lx6 d;
    public jm4 e;

    public pm4(lx6 lx6Var, px2 px2Var) {
        super(px2Var);
        this.c = lx6Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
