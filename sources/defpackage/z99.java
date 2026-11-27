package defpackage;
public final class z99 extends ax2 {
    public wj7 a;
    public Object b;
    public final aa9 c;
    public int d;

    public z99(aa9 aa9Var, ax2 ax2Var) {
        super(ax2Var);
        this.c = aa9Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
