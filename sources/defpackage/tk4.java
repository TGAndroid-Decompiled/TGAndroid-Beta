package defpackage;
public final class tk4 extends gw2 {
    public uk4 a;
    public Object b;
    public Object c;
    public final uk4 d;
    public int e;

    public tk4(uk4 uk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.d = uk4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
