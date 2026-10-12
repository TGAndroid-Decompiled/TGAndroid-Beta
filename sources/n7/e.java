package n7;
public final class e extends d {
    public final c7.x f16170a;

    public e(c7.x xVar) {
        this.f16170a = xVar;
    }

    @Override
    public final Object a() {
        return this.f16170a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16170a.equals(((e) obj).f16170a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16170a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.p("Optional.of(", this.f16170a.toString(), ")");
    }
}
