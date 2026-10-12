package k1;
public final class s extends ld.c {
    public Object f14367a;
    public Object f14368b;
    public Object f14369c;
    public kotlin.jvm.internal.p d;
    public a0 f14370e;
    public Object f14371f;
    public final t h;
    public int f14372n;

    public s(t tVar, ld.c cVar) {
        super(cVar);
        this.h = tVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f14371f = obj;
        this.f14372n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
