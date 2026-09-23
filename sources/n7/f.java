package n7;
public final class f extends e {
    public final c7.x f15091a;

    public f(c7.x xVar) {
        this.f15091a = xVar;
    }

    @Override
    public final Object a() {
        return this.f15091a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f15091a.equals(((f) obj).f15091a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15091a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.q("Optional.of(", this.f15091a.toString(), ")");
    }
}
