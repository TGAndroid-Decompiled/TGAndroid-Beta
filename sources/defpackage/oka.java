package defpackage;
public final class oka extends qx2 {
    public Object a;
    public qj7 b;
    public Object c;
    public final rka d;
    public int e;

    public oka(rka rkaVar, px2 px2Var) {
        super(px2Var);
        this.d = rkaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
