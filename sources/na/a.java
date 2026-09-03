package na;
public final class a extends wc.c {
    public Object f15878a;
    public ud.a f15879b;
    public Object f15880c;
    public final d d;
    public int f15881e;

    public a(d dVar, wc.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15880c = obj;
        this.f15881e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
