package o7;
public final class e extends d {
    public final d7.x f19203a;

    public e(d7.x xVar) {
        this.f19203a = xVar;
    }

    @Override
    public final Object a() {
        return this.f19203a;
    }

    @Override
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f19203a.equals(((e) obj).f19203a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19203a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a1.g.p("Optional.of(", this.f19203a.toString(), ")");
    }
}
