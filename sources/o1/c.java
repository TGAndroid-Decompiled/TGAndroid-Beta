package o1;
public final class c extends kd.c {
    public d f21608a;
    public Object f21609b;
    public final d f21610c;
    public int d;

    public c(d dVar, kd.c cVar) {
        super(cVar);
        this.f21610c = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f21609b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f21610c.a(null, this);
    }
}
