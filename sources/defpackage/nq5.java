package defpackage;
public final class nq5 extends ax2 {
    public Object a;
    public Object b;
    public final sjf c;
    public int d;

    public nq5(sjf sjfVar, ax2 ax2Var) {
        super(ax2Var);
        this.c = sjfVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.B(null, this);
    }
}
