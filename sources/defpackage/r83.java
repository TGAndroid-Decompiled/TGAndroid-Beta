package defpackage;
public final class r83 extends qx2 {
    public Object a;
    public int b;
    public final s83 c;

    public r83(s83 s83Var, px2 px2Var) {
        super(px2Var);
        this.c = s83Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
