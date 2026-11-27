package defpackage;
public final class bn4 extends ax2 {
    public Object a;
    public int b;
    public final um4 c;
    public xm4 d;

    public bn4(um4 um4Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = um4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.k(null, this);
    }
}
