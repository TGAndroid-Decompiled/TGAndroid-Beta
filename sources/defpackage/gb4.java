package defpackage;
public final class gb4 extends gw2 {
    public hb4 a;
    public Object b;
    public Object c;
    public sb4 d;
    public Object e;
    public final hb4 f;
    public int h;

    public gb4(hb4 hb4Var, gw2 gw2Var) {
        super(gw2Var);
        this.f = hb4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
