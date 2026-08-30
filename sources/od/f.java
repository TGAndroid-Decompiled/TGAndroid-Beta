package od;
public final class f extends wc.c {
    public g f16553a;
    public Object f16554b;
    public final g f16555c;
    public int d;

    public f(g gVar, wc.c cVar) {
        super(cVar);
        this.f16555c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16554b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f16555c.c(null, this);
    }
}
