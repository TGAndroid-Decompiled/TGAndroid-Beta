package k1;
public final class t extends md.c {
    public z f13809a;
    public Object f13810b;
    public final z f13811c;
    public int d;

    public t(z zVar, md.c cVar) {
        super(cVar);
        this.f13811c = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13810b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f13811c.e(this);
    }
}
