package k1;
public final class o extends kd.c {
    public Object f14317a;
    public int f14318b;
    public final p f14319c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f14319c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14317a = obj;
        this.f14318b |= Integer.MIN_VALUE;
        return this.f14319c.a(null, this);
    }
}
