package db;
public final class g extends ed.c {
    public h f5845a;
    public Object f5846b;
    public final h f5847c;
    public int d;

    public g(h hVar, ed.c cVar) {
        super(cVar);
        this.f5847c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f5846b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f5847c.b(this);
    }
}
