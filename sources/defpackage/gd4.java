package defpackage;
public final class gd4 extends qx2 {
    public hd4 a;
    public Object b;
    public Object c;
    public sd4 d;
    public Object e;
    public final hd4 f;
    public int h;

    public gd4(hd4 hd4Var, qx2 qx2Var) {
        super(qx2Var);
        this.f = hd4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f.b(null, this);
    }
}
