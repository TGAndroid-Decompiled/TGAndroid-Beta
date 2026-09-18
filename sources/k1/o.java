package k1;
public final class o extends kd.c {
    public Object f13180a;
    public int f13181b;
    public final p f13182c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f13182c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13180a = obj;
        this.f13181b |= Integer.MIN_VALUE;
        return this.f13182c.a(null, this);
    }
}
