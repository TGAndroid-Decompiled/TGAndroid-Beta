package defpackage;
public final class dd4 extends ax2 {
    public ed4 a;
    public Object b;
    public Object c;
    public pd4 d;
    public Object e;
    public final ed4 f;
    public int h;

    public dd4(ed4 ed4Var, ax2 ax2Var) {
        super(ax2Var);
        this.f = ed4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
