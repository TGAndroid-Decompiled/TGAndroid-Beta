package la;
public final class t implements od.c {
    public final int f12237a;
    public final Object f12238b;

    public t(Object obj, int i10) {
        this.f12237a = i10;
        this.f12238b = obj;
    }

    @Override
    public final Object c(Object obj, wc.c cVar) {
        switch (this.f12237a) {
            case 0:
                ((z) this.f12238b).f12254c.set((m) obj);
                return sc.i.f47243a;
            default:
                ((kotlin.jvm.internal.q) this.f12238b).f11340a = obj;
                throw new pd.a(this);
        }
    }
}
