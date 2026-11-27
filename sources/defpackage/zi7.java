package defpackage;
public final class zi7 extends ax2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public final bj7 e;
    public int f;

    public zi7(bj7 bj7Var, zw2 zw2Var) {
        super(zw2Var);
        this.e = bj7Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
