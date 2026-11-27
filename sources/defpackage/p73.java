package defpackage;
public final class p73 extends ax2 {
    public u8a a;
    public Object b;
    public final u8a c;
    public int d;

    public p73(u8a u8aVar, ax2 ax2Var) {
        super(ax2Var);
        this.c = u8aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.m(this);
    }
}
