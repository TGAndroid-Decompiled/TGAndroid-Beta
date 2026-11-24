package defpackage;
public final class n73 extends gw2 {
    public v73 a;
    public fwa b;
    public boolean c;
    public Object d;
    public final v73 e;
    public int f;

    public n73(v73 v73Var, fw2 fw2Var) {
        super(fw2Var);
        this.e = v73Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.g(false, this);
    }
}
