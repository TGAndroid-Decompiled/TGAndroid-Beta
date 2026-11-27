package defpackage;
public final class g83 extends ax2 {
    public o83 a;
    public i0b b;
    public boolean c;
    public Object d;
    public final o83 e;
    public int f;

    public g83(o83 o83Var, zw2 zw2Var) {
        super(zw2Var);
        this.e = o83Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(false, this);
    }
}
