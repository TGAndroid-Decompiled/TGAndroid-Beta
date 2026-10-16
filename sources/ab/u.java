package ab;
public final class u implements ee.c {
    public final int f467a;
    public final Object f468b;

    public u(Object obj, int i10) {
        this.f467a = i10;
        this.f468b = obj;
    }

    @Override
    public final Object a(Object obj, md.c cVar) {
        switch (this.f467a) {
            case 0:
                ((c0) this.f468b).f382c.set((n) obj);
                return id.i.f11390a;
            default:
                ((kotlin.jvm.internal.p) this.f468b).f14365a = obj;
                throw new fe.a(this);
        }
    }
}
