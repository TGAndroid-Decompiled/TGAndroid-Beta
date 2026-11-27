package defpackage;
public final class wm4 extends ax2 {
    public xm4 a;
    public Object b;
    public final xm4 c;
    public int d;

    public wm4(xm4 xm4Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = xm4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
