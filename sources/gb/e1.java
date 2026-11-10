package gb;
public final class e1 extends kd.c {
    public String f13667a;
    public c1 f13668b;
    public Object f13669c;
    public final f1 d;
    public int f13670e;

    public e1(f1 f1Var, id.c cVar) {
        super(cVar);
        this.d = f1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13669c = obj;
        this.f13670e |= Integer.MIN_VALUE;
        return f1.a(this.d, null, null, this);
    }
}
