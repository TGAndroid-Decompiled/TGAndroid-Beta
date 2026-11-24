package defpackage;
public final class vk4 extends gw2 {
    public Object a;
    public int b;
    public final wk4 c;
    public rk4 d;

    public vk4(wk4 wk4Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = wk4Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
