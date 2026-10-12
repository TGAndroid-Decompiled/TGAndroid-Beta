package k1;
public final class w extends md.c {
    public Object f13815a;
    public Object f13816b;
    public Object f13817c;
    public final z d;
    public int e;

    public w(z zVar, md.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13817c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
