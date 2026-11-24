package defpackage;
public final class ufa extends gw2 {
    public vfa a;
    public Object b;
    public final vfa c;
    public int d;

    public ufa(vfa vfaVar, gw2 gw2Var) {
        super(gw2Var);
        this.c = vfaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
