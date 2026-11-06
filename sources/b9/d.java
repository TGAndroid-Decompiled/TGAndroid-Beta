package b9;
public final class d implements a9.a {
    public final qb.a f3036a;

    public d(qb.a aVar) {
        this.f3036a = aVar;
    }

    @Override
    public final void a(f fVar) {
        q6.m.h(fVar, "channel must not be null");
    }

    @Override
    public final void b(f fVar) {
        q6.m.h(fVar, "channel must not be null");
    }

    @Override
    public final void c(f fVar) {
        q6.m.h(fVar, "channel must not be null");
    }

    @Override
    public final void d(f fVar) {
        q6.m.h(fVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f3036a.equals(((d) obj).f3036a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3036a.hashCode();
    }
}
