package n7;
public final class e extends d {
    public final c7.x f16766a;

    public e(c7.x xVar) {
        this.f16766a = xVar;
    }

    @Override
    public final Object a() {
        return this.f16766a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16766a.equals(((e) obj).f16766a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16766a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.p("Optional.of(", this.f16766a.toString(), ")");
    }
}
