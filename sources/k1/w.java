package k1;
public final class w extends md.c {
    public Object f14620a;
    public Object f14621b;
    public Object f14622c;
    public final z d;
    public int e;

    public w(z zVar, md.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14622c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
