package defpackage;
public final class g2 extends ax2 {
    public gs9 a;
    public Object b;
    public final l09 c;
    public int d;

    public g2(l09 l09Var, zw2 zw2Var) {
        super(zw2Var);
        this.c = l09Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(null, this);
    }
}
