package gb;
public final class o extends hd.c {
    public Object f12233a;
    public final p f12234b;
    public int f12235c;

    public o(p pVar, hd.c cVar) {
        super(cVar);
        this.f12234b = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f12233a = obj;
        this.f12235c |= Integer.MIN_VALUE;
        return this.f12234b.c(null, this);
    }
}
