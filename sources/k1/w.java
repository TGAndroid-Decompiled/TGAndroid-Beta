package k1;
public final class w extends md.c {
    public Object f13818a;
    public Object f13819b;
    public Object f13820c;
    public final z d;
    public int e;

    public w(z zVar, md.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13820c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
