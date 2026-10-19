package n7;
public final class e extends d {
    public final c7.x f17261a;

    public e(c7.x xVar) {
        this.f17261a = xVar;
    }

    @Override
    public final Object a() {
        return this.f17261a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f17261a.equals(((e) obj).f17261a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17261a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.p("Optional.of(", this.f17261a.toString(), ")");
    }
}
