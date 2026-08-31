package b7;
public final class g extends f {
    public final q6.x f1819a;

    public g(q6.x xVar) {
        this.f1819a = xVar;
    }

    @Override
    public final Object a() {
        return this.f1819a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f1819a.equals(((g) obj).f1819a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1819a.hashCode() + 1502476572;
    }

    public final String toString() {
        return android.support.v4.media.a.o("Optional.of(", this.f1819a.toString(), ")");
    }
}
