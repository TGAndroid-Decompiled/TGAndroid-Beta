package n7;
public final class e extends d {
    public final c7.x f15334a;

    public e(c7.x xVar) {
        this.f15334a = xVar;
    }

    @Override
    public final Object a() {
        return this.f15334a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f15334a.equals(((e) obj).f15334a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15334a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.p("Optional.of(", this.f15334a.toString(), ")");
    }
}
