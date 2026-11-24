package defpackage;
public final class ok4 extends gw2 {
    public Object a;
    public int b;
    public final lv6 c;
    public lv6 d;
    public ik4 e;

    public ok4(lv6 lv6Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = lv6Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
