package defpackage;
public final class w63 extends gw2 {
    public c5a a;
    public Object b;
    public final c5a c;
    public int d;

    public w63(c5a c5aVar, gw2 gw2Var) {
        super(gw2Var);
        this.c = c5aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.i(this);
    }
}
