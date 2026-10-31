package bb;
public final class u implements wd.c {
    public final int f2623a;
    public final Object f2624b;

    public u(Object obj, int i10) {
        this.f2623a = i10;
        this.f2624b = obj;
    }

    @Override
    public final Object b(Object obj, ed.c cVar) {
        switch (this.f2623a) {
            case 0:
                ((c0) this.f2624b).f2538c.set((n) obj);
                return ad.j.f401a;
            default:
                ((kotlin.jvm.internal.p) this.f2624b).f11444a = obj;
                throw new xd.a(this);
        }
    }
}
