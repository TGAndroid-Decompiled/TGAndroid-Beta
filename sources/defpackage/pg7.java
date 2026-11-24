package defpackage;
public final class pg7 extends gw2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public final rg7 e;
    public int f;

    public pg7(rg7 rg7Var, fw2 fw2Var) {
        super(fw2Var);
        this.e = rg7Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
