package defpackage;
public final class ima extends ax2 {
    public xj7 a;
    public boolean b;
    public Object c;
    public final kma d;
    public int e;

    public ima(kma kmaVar, zw2 zw2Var) {
        super(zw2Var);
        this.d = kmaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, this);
    }
}
