package defpackage;
public final class zm4 extends ax2 {
    public an4 a;
    public Object b;
    public Object c;
    public final an4 d;
    public int e;

    public zm4(an4 an4Var, zw2 zw2Var) {
        super(zw2Var);
        this.d = an4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
