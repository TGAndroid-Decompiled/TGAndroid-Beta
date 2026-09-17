package n7;
public final class f extends e {
    public final c7.x f15126a;

    public f(c7.x xVar) {
        this.f15126a = xVar;
    }

    @Override
    public final Object a() {
        return this.f15126a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f15126a.equals(((f) obj).f15126a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15126a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.p("Optional.of(", this.f15126a.toString(), ")");
    }
}
