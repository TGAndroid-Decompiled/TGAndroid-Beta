package defpackage;
public final class cd4 extends ax2 {
    public ed4 a;
    public lc4 b;
    public boolean c;
    public Object d;
    public final ed4 e;
    public int f;

    public cd4(ed4 ed4Var, ax2 ax2Var) {
        super(ax2Var);
        this.e = ed4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
