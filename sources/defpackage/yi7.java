package defpackage;
public final class yi7 extends ax2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public final aj7 e;
    public int f;

    public yi7(aj7 aj7Var, zw2 zw2Var) {
        super(zw2Var);
        this.e = aj7Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
