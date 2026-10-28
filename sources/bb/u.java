package bb;
public final class u implements fe.c {
    public final int f3822a;
    public final Object f3823b;

    public u(Object obj, int i10) {
        this.f3822a = i10;
        this.f3823b = obj;
    }

    @Override
    public final Object b(Object obj, nd.c cVar) {
        switch (this.f3822a) {
            case 0:
                ((c0) this.f3823b).f3738c.set((n) obj);
                return jd.i.f15579a;
            default:
                ((kotlin.jvm.internal.p) this.f3823b).f16668a = obj;
                throw new ge.a(this);
        }
    }
}
