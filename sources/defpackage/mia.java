package defpackage;
public final class mia extends gw2 {
    public Object a;
    public nh7 b;
    public Object c;
    public final pia d;
    public int e;

    public mia(pia piaVar, fw2 fw2Var) {
        super(fw2Var);
        this.d = piaVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
