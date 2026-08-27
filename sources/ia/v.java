package ia;

public final class v implements ld.c {

    public final int f11083a;

    public final Object f11084b;

    public v(Object obj, int i10) {
        this.f11083a = i10;
        this.f11084b = obj;
    }

    @Override
    public final Object c(Object obj, tc.c cVar) {
        switch (this.f11083a) {
            case 0:
                ((d0) this.f11084b).f10996c.set((o) obj);
                return pc.i.f45696a;
            default:
                ((kotlin.jvm.internal.q) this.f11084b).f15253a = obj;
                throw new md.a(this);
        }
    }
}
