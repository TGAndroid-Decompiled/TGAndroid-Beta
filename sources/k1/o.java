package k1;
public final class o extends kd.c {
    public Object f13172a;
    public int f13173b;
    public final p f13174c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f13174c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13172a = obj;
        this.f13173b |= Integer.MIN_VALUE;
        return this.f13174c.a(null, this);
    }
}
