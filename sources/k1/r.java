package k1;
public final class r extends nd.c {
    public Object f16078a;
    public Object f16079b;
    public Object f16080c;
    public kotlin.jvm.internal.p d;
    public z e;
    public Object f16081f;
    public final s h;
    public int f16082n;

    public r(s sVar, nd.c cVar) {
        super(cVar);
        this.h = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16081f = obj;
        this.f16082n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
