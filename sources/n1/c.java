package n1;
public final class c extends hd.c {
    public d f20117a;
    public Object f20118b;
    public final d f20119c;
    public int d;

    public c(d dVar, hd.c cVar) {
        super(cVar);
        this.f20119c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f20118b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f20119c.a(null, this);
    }
}
