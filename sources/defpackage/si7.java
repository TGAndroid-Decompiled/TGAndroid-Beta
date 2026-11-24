package defpackage;
public final class si7 extends qx2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public final ui7 e;
    public int f;

    public si7(ui7 ui7Var, px2 px2Var) {
        super(px2Var);
        this.e = ui7Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
