package b7;
public final class g extends f {
    public final q6.x f1680a;

    public g(q6.x xVar) {
        this.f1680a = xVar;
    }

    @Override
    public final Object a() {
        return this.f1680a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f1680a.equals(((g) obj).f1680a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1680a.hashCode() + 1502476572;
    }

    public final String toString() {
        return android.support.v4.media.a.o("Optional.of(", this.f1680a.toString(), ")");
    }
}
