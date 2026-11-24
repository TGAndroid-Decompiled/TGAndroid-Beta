package defpackage;
public final class mm4 extends qx2 {
    public Object a;
    public int b;
    public final nm4 c;
    public Object d;
    public jm4 e;

    public mm4(nm4 nm4Var, px2 px2Var) {
        super(px2Var);
        this.c = nm4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
