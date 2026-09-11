package n7;
public final class e extends d {
    public final c7.x f16623a;

    public e(c7.x xVar) {
        this.f16623a = xVar;
    }

    @Override
    public final Object a() {
        return this.f16623a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16623a.equals(((e) obj).f16623a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16623a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.p("Optional.of(", this.f16623a.toString(), ")");
    }
}
