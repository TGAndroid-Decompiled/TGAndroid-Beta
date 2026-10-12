package k1;
public final class t extends md.c {
    public z f13806a;
    public Object f13807b;
    public final z f13808c;
    public int d;

    public t(z zVar, md.c cVar) {
        super(cVar);
        this.f13808c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13807b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13808c.e(this);
    }
}
