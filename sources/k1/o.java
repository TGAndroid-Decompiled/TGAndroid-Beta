package k1;
public final class o extends kd.c {
    public Object f13177a;
    public int f13178b;
    public final p f13179c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f13179c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13177a = obj;
        this.f13178b |= Integer.MIN_VALUE;
        return this.f13179c.a(null, this);
    }
}
