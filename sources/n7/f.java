package n7;
public final class f extends e {
    public final c7.x f17267a;

    public f(c7.x xVar) {
        this.f17267a = xVar;
    }

    @Override
    public final Object a() {
        return this.f17267a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f17267a.equals(((f) obj).f17267a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17267a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.p("Optional.of(", this.f17267a.toString(), ")");
    }
}
