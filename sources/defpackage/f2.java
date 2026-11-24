package defpackage;
public final class f2 extends gw2 {
    public oo9 a;
    public Object b;
    public final v39 c;
    public int d;

    public f2(v39 v39Var, fw2 fw2Var) {
        super(fw2Var);
        this.c = v39Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(null, this);
    }
}
