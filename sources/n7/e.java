package n7;
public final class e extends d {
    public final c7.x f16767a;

    public e(c7.x xVar) {
        this.f16767a = xVar;
    }

    @Override
    public final Object a() {
        return this.f16767a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f16767a.equals(((e) obj).f16767a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16767a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a4.a.p("Optional.of(", this.f16767a.toString(), ")");
    }
}
