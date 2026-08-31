package na;
public final class a extends wc.c {
    public Object f15876a;
    public ud.a f15877b;
    public Object f15878c;
    public final d d;
    public int f15879e;

    public a(d dVar, wc.c cVar) {
        super(cVar);
        this.d = dVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f15878c = obj;
        this.f15879e |= Integer.MIN_VALUE;
        return this.d.c(this);
    }
}
