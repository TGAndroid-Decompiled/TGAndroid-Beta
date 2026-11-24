package defpackage;
public final class gaa extends qx2 {
    public Object a;
    public final haa b;
    public int c;

    public gaa(haa haaVar, qx2 qx2Var) {
        super(qx2Var);
        this.b = haaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
