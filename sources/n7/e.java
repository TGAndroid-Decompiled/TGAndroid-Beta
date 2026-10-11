package n7;
public final class e extends d {
    public final c7.x f16789a;

    public e(c7.x xVar) {
        this.f16789a = xVar;
    }

    @Override
    public final Object a() {
        return this.f16789a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16789a.equals(((e) obj).f16789a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16789a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.q("Optional.of(", this.f16789a.toString(), ")");
    }
}
