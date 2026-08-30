package la;
public final class t implements od.c {
    public final int f11820a;
    public final Object f11821b;

    public t(Object obj, int i10) {
        this.f11820a = i10;
        this.f11821b = obj;
    }

    @Override
    public final Object c(Object obj, wc.c cVar) {
        switch (this.f11820a) {
            case 0:
                ((z) this.f11821b).f11836c.set((m) obj);
                return sc.i.f44253a;
            default:
                ((kotlin.jvm.internal.q) this.f11821b).f10990a = obj;
                throw new pd.a(this);
        }
    }
}
