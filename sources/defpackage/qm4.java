package defpackage;
public final class qm4 extends ax2 {
    public Object a;
    public int b;
    public final rm4 c;
    public Object d;
    public nm4 e;

    public qm4(rm4 rm4Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = rm4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.k(null, this);
    }
}
