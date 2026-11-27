package defpackage;
public final class y73 extends ax2 {
    public Object a;
    public int b;
    public final z73 c;

    public y73(z73 z73Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = z73Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
