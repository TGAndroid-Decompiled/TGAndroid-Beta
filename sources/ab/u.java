package ab;
public final class u implements ee.c {
    public final int f466a;
    public final Object f467b;

    public u(Object obj, int i10) {
        this.f466a = i10;
        this.f467b = obj;
    }

    @Override
    public final Object a(Object obj, md.c cVar) {
        switch (this.f466a) {
            case 0:
                ((c0) this.f467b).f381c.set((n) obj);
                return id.i.f12779a;
            default:
                ((kotlin.jvm.internal.p) this.f467b).f15697a = obj;
                throw new fe.a(this);
        }
    }
}
