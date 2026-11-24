package defpackage;
public final class f73 extends gw2 {
    public Object a;
    public int b;
    public final g73 c;

    public f73(g73 g73Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = g73Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
