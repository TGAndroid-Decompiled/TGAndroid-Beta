package defpackage;
public final class vm4 extends qx2 {
    public Object a;
    public int b;
    public final wm4 c;
    public sm4 d;

    public vm4(wm4 wm4Var, px2 px2Var) {
        super(px2Var);
        this.c = wm4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.g(null, this);
    }
}
