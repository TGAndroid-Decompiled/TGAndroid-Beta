package defpackage;
public final class pka extends qx2 {
    public qj7 a;
    public boolean b;
    public Object c;
    public final rka d;
    public int e;

    public pka(rka rkaVar, px2 px2Var) {
        super(px2Var);
        this.d = rkaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, this);
    }
}
