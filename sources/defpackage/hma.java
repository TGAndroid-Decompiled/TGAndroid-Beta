package defpackage;
public final class hma extends ax2 {
    public Object a;
    public wj7 b;
    public Object c;
    public final kma d;
    public int e;

    public hma(kma kmaVar, zw2 zw2Var) {
        super(zw2Var);
        this.d = kmaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
