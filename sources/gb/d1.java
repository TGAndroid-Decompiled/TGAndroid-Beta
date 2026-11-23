package gb;
public final class d1 extends kd.c {
    public String f13307a;
    public b1 f13308b;
    public Object f13309c;
    public final e1 d;
    public int f13310e;

    public d1(e1 e1Var, id.c cVar) {
        super(cVar);
        this.d = e1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13309c = obj;
        this.f13310e |= Integer.MIN_VALUE;
        return e1.a(this.d, null, null, this);
    }
}
