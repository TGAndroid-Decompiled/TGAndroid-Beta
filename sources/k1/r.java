package k1;
public final class r extends nd.c {
    public Object f16079a;
    public Object f16080b;
    public Object f16081c;
    public kotlin.jvm.internal.p d;
    public z e;
    public Object f16082f;
    public final s h;
    public int f16083n;

    public r(s sVar, nd.c cVar) {
        super(cVar);
        this.h = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f16082f = obj;
        this.f16083n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
