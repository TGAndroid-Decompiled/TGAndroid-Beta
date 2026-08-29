package ja;
public final class u implements md.c {
    public final int f11406a;
    public final Object f11407b;

    public u(Object obj, int i10) {
        this.f11406a = i10;
        this.f11407b = obj;
    }

    @Override
    public final Object c(Object obj, uc.c cVar) {
        switch (this.f11406a) {
            case 0:
                ((c0) this.f11407b).f11314c.set((n) obj);
                return qc.i.f46603a;
            default:
                ((kotlin.jvm.internal.q) this.f11407b).f13927a = obj;
                throw new nd.a(this);
        }
    }
}
