package n7;
public final class f extends e {
    public final c7.x f13946a;

    public f(c7.x xVar) {
        this.f13946a = xVar;
    }

    @Override
    public final Object a() {
        return this.f13946a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f13946a.equals(((f) obj).f13946a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13946a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.p("Optional.of(", this.f13946a.toString(), ")");
    }
}
