package k1;
public final class s extends ld.c {
    public Object f14368a;
    public Object f14369b;
    public Object f14370c;
    public kotlin.jvm.internal.p d;
    public a0 f14371e;
    public Object f14372f;
    public final t h;
    public int f14373n;

    public s(t tVar, ld.c cVar) {
        super(cVar);
        this.h = tVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14372f = obj;
        this.f14373n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
