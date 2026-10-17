package n7;
public final class f extends e {
    public final c7.x f17260a;

    public f(c7.x xVar) {
        this.f17260a = xVar;
    }

    @Override
    public final Object a() {
        return this.f17260a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f17260a.equals(((f) obj).f17260a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17260a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.p("Optional.of(", this.f17260a.toString(), ")");
    }
}
