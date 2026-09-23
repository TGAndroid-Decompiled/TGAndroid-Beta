package k1;
public final class o extends kd.c {
    public Object f13169a;
    public int f13170b;
    public final p f13171c;

    public o(p pVar, kd.c cVar) {
        super(cVar);
        this.f13171c = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13169a = obj;
        this.f13170b |= Integer.MIN_VALUE;
        return this.f13171c.a(null, this);
    }
}
