package defpackage;
public final class m69 extends gw2 {
    public nh7 a;
    public Object b;
    public final n69 c;
    public int d;

    public m69(n69 n69Var, gw2 gw2Var) {
        super(gw2Var);
        this.c = n69Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
