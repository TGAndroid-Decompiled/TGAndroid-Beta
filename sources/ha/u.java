package ha;
public final class u implements kd.c {
    public final int f10371a;
    public final Object f10372b;

    public u(Object obj, int i9) {
        this.f10371a = i9;
        this.f10372b = obj;
    }

    @Override
    public final Object c(Object obj, sc.c cVar) {
        switch (this.f10371a) {
            case 0:
                ((c0) this.f10372b).f10279c.set((n) obj);
                return oc.i.f19197a;
            default:
                ((kotlin.jvm.internal.p) this.f10372b).f16499a = obj;
                throw new ld.a(this);
        }
    }
}
