package n7;
public final class e extends d {
    public final c7.x f15324a;

    public e(c7.x xVar) {
        this.f15324a = xVar;
    }

    @Override
    public final Object a() {
        return this.f15324a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f15324a.equals(((e) obj).f15324a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15324a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.q("Optional.of(", this.f15324a.toString(), ")");
    }
}
