package ab;
public final class u implements ee.c {
    public final int f465a;
    public final Object f466b;

    public u(Object obj, int i10) {
        this.f465a = i10;
        this.f466b = obj;
    }

    @Override
    public final Object a(Object obj, md.c cVar) {
        switch (this.f465a) {
            case 0:
                ((c0) this.f466b).f380c.set((n) obj);
                return id.i.f12777a;
            default:
                ((kotlin.jvm.internal.p) this.f466b).f15705a = obj;
                throw new fe.a(this);
        }
    }
}
