package n7;
public final class e extends d {
    public final c7.x f16493a;

    public e(c7.x xVar) {
        this.f16493a = xVar;
    }

    @Override
    public final Object a() {
        return this.f16493a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16493a.equals(((e) obj).f16493a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16493a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.q("Optional.of(", this.f16493a.toString(), ")");
    }
}
