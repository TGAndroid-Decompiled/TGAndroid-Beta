package k1;
public final class r extends md.c {
    public Object f13801a;
    public Object f13802b;
    public Object f13803c;
    public kotlin.jvm.internal.p d;
    public z e;
    public Object f13804f;
    public final s h;
    public int f13805n;

    public r(s sVar, md.c cVar) {
        super(cVar);
        this.h = sVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.f13804f = obj;
        this.f13805n |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
