package ee;
public final class f extends md.c {
    public g f8743a;
    public Object f8744b;
    public final g f8745c;
    public int d;

    public f(g gVar, md.c cVar) {
        super(cVar);
        this.f8745c = gVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f8744b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f8745c.a(null, this);
    }
}
