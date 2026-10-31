package k1;
public final class w extends ed.c {
    public Object f10574a;
    public Object f10575b;
    public Object f10576c;
    public final z d;
    public int e;

    public w(z zVar, ed.c cVar) {
        super(cVar);
        this.d = zVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f10576c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(this);
    }
}
