package k1;
public final class s extends ld.c {
    public Object f14371a;
    public Object f14372b;
    public Object f14373c;
    public kotlin.jvm.internal.p d;
    public a0 f14374e;
    public Object f14375f;
    public final t h;
    public int f14376n;

    public s(t tVar, ld.c cVar) {
        super(cVar);
        this.h = tVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14375f = obj;
        this.f14376n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
