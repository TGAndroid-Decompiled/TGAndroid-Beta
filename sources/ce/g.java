package ce;
public final class g extends kd.c {
    public Object f4930a;
    public int f4931b;
    public final h f4932c;
    public Object d;
    public d f4933e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f4932c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f4930a = obj;
        this.f4931b |= Integer.MIN_VALUE;
        return this.f4932c.G(null, this);
    }
}
