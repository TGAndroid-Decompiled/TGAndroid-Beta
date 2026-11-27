package defpackage;
public final class xja extends ax2 {
    public String a;
    public vja b;
    public Object c;
    public final yja d;
    public int e;

    public xja(yja yjaVar, zw2 zw2Var) {
        super(zw2Var);
        this.d = yjaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, this);
    }
}
