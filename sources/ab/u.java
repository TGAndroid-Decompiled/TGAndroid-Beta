package ab;
public final class u implements ee.c {
    public final int f463a;
    public final Object f464b;

    public u(Object obj, int i10) {
        this.f463a = i10;
        this.f464b = obj;
    }

    @Override
    public final Object a(Object obj, md.c cVar) {
        switch (this.f463a) {
            case 0:
                ((c0) this.f464b).f378c.set((n) obj);
                return id.i.f11386a;
            default:
                ((kotlin.jvm.internal.p) this.f464b).f14363a = obj;
                throw new fe.a(this);
        }
    }
}
