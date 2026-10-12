package n7;
public final class e extends d {
    public final c7.x f16492a;

    public e(c7.x xVar) {
        this.f16492a = xVar;
    }

    @Override
    public final Object a() {
        return this.f16492a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16492a.equals(((e) obj).f16492a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16492a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.q("Optional.of(", this.f16492a.toString(), ")");
    }
}
