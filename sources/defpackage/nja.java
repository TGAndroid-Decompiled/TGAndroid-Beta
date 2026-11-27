package defpackage;
public final class nja extends ax2 {
    public oja a;
    public Object b;
    public final oja c;
    public int d;

    public nja(oja ojaVar, ax2 ax2Var) {
        super(ax2Var);
        this.c = ojaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
