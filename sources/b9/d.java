package b9;
public final class d implements a9.a {
    public final qb.a f2956a;

    public d(qb.a aVar) {
        this.f2956a = aVar;
    }

    @Override
    public final void a(f fVar) {
        q6.m.i(fVar, "channel must not be null");
    }

    @Override
    public final void b(f fVar) {
        q6.m.i(fVar, "channel must not be null");
    }

    @Override
    public final void c(f fVar) {
        q6.m.i(fVar, "channel must not be null");
    }

    @Override
    public final void d(f fVar) {
        q6.m.i(fVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f2956a.equals(((d) obj).f2956a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2956a.hashCode();
    }
}
