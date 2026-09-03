package la;
public final class t implements od.c {
    public final int f11930a;
    public final Object f11931b;

    public t(Object obj, int i10) {
        this.f11930a = i10;
        this.f11931b = obj;
    }

    @Override
    public final Object c(Object obj, wc.c cVar) {
        switch (this.f11930a) {
            case 0:
                ((z) this.f11931b).f11946c.set((m) obj);
                return sc.i.f44318a;
            default:
                ((kotlin.jvm.internal.q) this.f11931b).f11100a = obj;
                throw new pd.a(this);
        }
    }
}
