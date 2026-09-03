package k1;
public final class v extends wc.c {
    public Object f9593a;
    public Object f9594b;
    public Object f9595c;
    public kotlin.jvm.internal.q d;
    public d0 e;
    public Object f9596f;
    public final w h;
    public int f9597n;

    public v(w wVar, wc.c cVar) {
        super(cVar);
        this.h = wVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f9596f = obj;
        this.f9597n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
