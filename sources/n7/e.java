package n7;
public final class e extends d {
    public final c7.x f13663a;

    public e(c7.x xVar) {
        this.f13663a = xVar;
    }

    @Override
    public final Object a() {
        return this.f13663a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f13663a.equals(((e) obj).f13663a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13663a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.n("Optional.of(", this.f13663a.toString(), ")");
    }
}
