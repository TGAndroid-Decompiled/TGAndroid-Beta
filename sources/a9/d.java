package a9;
public final class d implements z8.a {
    public final kb.a f183a;

    public d(kb.a aVar) {
        this.f183a = aVar;
    }

    @Override
    public final void a(f fVar) {
        p6.m.h(fVar, "channel must not be null");
    }

    @Override
    public final void b(f fVar) {
        p6.m.h(fVar, "channel must not be null");
    }

    @Override
    public final void c(f fVar) {
        p6.m.h(fVar, "channel must not be null");
    }

    @Override
    public final void d(f fVar) {
        p6.m.h(fVar, "channel must not be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            return this.f183a.equals(((d) obj).f183a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f183a.hashCode();
    }
}
