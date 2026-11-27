package defpackage;
public final class yr9 extends ax2 {
    public u8a a;
    public xj7 b;
    public Object c;
    public final u8a d;
    public int e;

    public yr9(u8a u8aVar, ax2 ax2Var) {
        super(ax2Var);
        this.d = u8aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.F(this);
    }
}
