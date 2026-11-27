package defpackage;
public final class m83 extends ax2 {
    public n89 a;
    public Object b;
    public final o83 c;
    public int d;

    public m83(o83 o83Var, ax2 ax2Var) {
        super(ax2Var);
        this.c = o83Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(null, false, this);
    }
}
