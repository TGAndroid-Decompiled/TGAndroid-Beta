package defpackage;
public final class c83 extends ax2 {
    public Object a;
    public o83 b;
    public vp2 c;
    public Object d;
    public final o83 e;
    public int f;

    public c83(o83 o83Var, ax2 ax2Var) {
        super(ax2Var);
        this.e = o83Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
