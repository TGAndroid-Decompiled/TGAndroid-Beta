package defpackage;
public final class f93 extends qx2 {
    public c79 a;
    public Object b;
    public final h93 c;
    public int d;

    public f93(h93 h93Var, qx2 qx2Var) {
        super(qx2Var);
        this.c = h93Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(null, false, this);
    }
}
