package k1;
public final class s extends ld.c {
    public Object f14370a;
    public Object f14371b;
    public Object f14372c;
    public kotlin.jvm.internal.p d;
    public a0 f14373e;
    public Object f14374f;
    public final t h;
    public int f14375n;

    public s(t tVar, ld.c cVar) {
        super(cVar);
        this.h = tVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14374f = obj;
        this.f14375n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
