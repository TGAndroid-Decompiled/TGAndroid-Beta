package ce;
public final class g extends kd.c {
    public Object f6100a;
    public int f6101b;
    public final h f6102c;
    public Object d;
    public d f6103e;

    public g(h hVar, kd.c cVar) {
        super(cVar);
        this.f6102c = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f6100a = obj;
        this.f6101b |= Integer.MIN_VALUE;
        return this.f6102c.B(null, this);
    }
}
