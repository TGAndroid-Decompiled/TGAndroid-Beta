package ce;
public final class n extends kd.c {
    public o f4954a;
    public Object f4955b;
    public Object f4956c;
    public final o d;
    public int f4957e;

    public n(o oVar, id.c cVar) {
        super(cVar);
        this.d = oVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4956c = obj;
        this.f4957e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
