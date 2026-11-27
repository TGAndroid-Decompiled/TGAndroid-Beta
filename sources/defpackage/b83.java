package defpackage;
public final class b83 extends ax2 {
    public o83 a;
    public wj7 b;
    public Object c;
    public final o83 d;
    public int e;

    public b83(o83 o83Var, ax2 ax2Var) {
        super(ax2Var);
        this.d = o83Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
