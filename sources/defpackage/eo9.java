package defpackage;
public final class eo9 extends gw2 {
    public c5a a;
    public nh7 b;
    public Object c;
    public final c5a d;
    public int e;

    public eo9(c5a c5aVar, gw2 gw2Var) {
        super(gw2Var);
        this.d = c5aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.M(this);
    }
}
