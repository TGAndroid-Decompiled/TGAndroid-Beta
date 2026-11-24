package defpackage;
public final class nk4 extends gw2 {
    public Object a;
    public int b;
    public final tg2 c;
    public tg2 d;
    public ik4 e;
    public oo9 f;

    public nk4(tg2 tg2Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = tg2Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
